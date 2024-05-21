package com.auth.auth.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.auth.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
    User findByUsername(String username); 

}
