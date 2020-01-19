package cn.jiuwei.test;

import cn.jiuwei.dao.UserDao;
import cn.jiuwei.domain.User;
import org.junit.jupiter.api.Test;

public class UserDaoTest {

    @Test
    public void testLogin(){
        UserDao dao = new UserDao();
        User loginuser = new User();
        loginuser.setUsername("root");
        loginuser.setPassword("123");
        User user = dao.lgoin(loginuser);
        System.out.println(user);
    }
}
