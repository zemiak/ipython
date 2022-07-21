package org.acme;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class TodoEntity extends PanacheEntity {
    public String text;
}
