organization := "org.scalablytyped"
name := "apollo-server"
version := "2.9.16-1c12e3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-6c767c",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.11-2baa62",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.4-a42cc9",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.14-e0a8a7",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.4-ad40b5",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-c36848",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.1-bdb6c2",
  "org.scalablytyped" %%% "apollo-server-core" % "2.9.16-90e1b5",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-8bd546",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.4-360bce",
  "org.scalablytyped" %%% "apollo-server-express" % "2.9.16-adc8b9",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.10-7bf8f6",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.10-4ffafe",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.3-9f99ab",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.3-3af9a4",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-7c2978",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-1b4f69",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-b60015",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-4aabca",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190819Z-a8b207",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-42b39e",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-56f2e3",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191220Z-8b81e3",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-4f42f1",
  "org.scalablytyped" %%% "graphql" % "14.5.8-ac6a9e",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.10-21770b",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-9269b0",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.6-ead7be",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-87770c",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20191226Z-98d69d",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20191127Z-f05fe3",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20190322Z-6241aa",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-03061a",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-b58a9e",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-314389",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-2a7565",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200115Z-c1344d",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-610cde")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        