organization := "org.scalablytyped"
name := "apollo-server-core"
version := "2.9.6-3e4a3a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-c17a5d",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.5-6a6f15",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.3-2fbd77",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.7-ed1ad0",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.1-b49b3e",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-05736d",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-d1718e",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-1b81a1",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.3-b6a6bf",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.5-e476be",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.5-c9a60b",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.0-11a727",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-9f943f",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-3cddfd",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-409dd3",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-f2c2c6",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-dd73fa",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-af9a1f",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191015Z-cfcbef",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-9a4e87",
  "org.scalablytyped" %%% "graphql" % "14.5.8-9a82b3",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.4-c07b2d",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.5-93dc69",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-44a322",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-1dd753",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20191016Z-7ab67d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-8e1e66",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191015Z-4f243e",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-b8febd",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c44ea2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-6388bc",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-825c3d",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-922439",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-fe506f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        