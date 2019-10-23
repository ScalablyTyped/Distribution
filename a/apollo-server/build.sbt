organization := "org.scalablytyped"
name := "apollo-server"
version := "2.9.7-cd1d78"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-5e503c",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.5-76f5c5",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.3-2fbd77",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.7-31a902",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.1-b49b3e",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-05736d",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-d1718e",
  "org.scalablytyped" %%% "apollo-server-core" % "2.9.7-612fb5",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-4b0001",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.4-984ae3",
  "org.scalablytyped" %%% "apollo-server-express" % "2.9.7-16a05d",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.5-e908e9",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.5-7946ec",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.0-11a727",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-9f943f",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-d915df",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-6c5fc3",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-17b25d",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190819Z-008489",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-dd73fa",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-84e4a5",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191015Z-847ee7",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-b48a3d",
  "org.scalablytyped" %%% "graphql" % "14.5.8-9a82b3",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.4-3c27b6",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-1ba24e",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.5-93dc69",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-6b83d7",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-1dd753",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20191016Z-3de147",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-8e1e66",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191022Z-f18ffd",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-b8febd",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c44ea2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-0ea21e",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-16a861",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-1d5525",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-fe506f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        