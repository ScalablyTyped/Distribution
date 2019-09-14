organization := "org.scalablytyped"
name := "apollo-server-express"
version := "2.9.3-fe449b"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-7abcc9",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.4-f8feda",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.3-9400c3",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.6-f34b4e",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.0-4a2a3e",
  "org.scalablytyped" %%% "apollo-link" % "1.2.12-645210",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-a17842",
  "org.scalablytyped" %%% "apollo-server-core" % "2.9.3-b41083",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-3c8fde",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.3-e0b201",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.4-5c945d",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.4-06a746",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.0-769817",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-73113c",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-8ff114",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-090bd5",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-26f1f7",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190819Z-8948ae",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-ec25ff",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-915bef",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-48acfb",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-9ca789",
  "org.scalablytyped" %%% "graphql" % "14.5.5-67e081",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.3-f8d7db",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-b7220c",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.5-7cd60b",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-81d9bf",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-9360b6",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-f7b87a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-612693",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-da4655",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-e83d9b",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-db4fa8",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-4181d6",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-06b0a9",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-a3a190",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.19-8a9e63")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        