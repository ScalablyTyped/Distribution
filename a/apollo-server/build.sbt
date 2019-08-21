organization := "org.scalablytyped"
name := "apollo-server"
version := "2.8.2-56a189"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-fe708f",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.1-5a7e15",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.1-c0f7ef",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.3-434502",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.0-dc2d6d",
  "org.scalablytyped" %%% "apollo-link" % "1.2.12-8d970c",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-595810",
  "org.scalablytyped" %%% "apollo-server-core" % "2.8.2-b6be5a",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.1-f4d86f",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.1-b52fbc",
  "org.scalablytyped" %%% "apollo-server-express" % "2.8.2-656f20",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.1-ac9d95",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.1-2b60d8",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.0-deb43b",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-2339ba",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-234f40",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-8f9eda",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-a81a50",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190819Z-d699f0",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-ea4c05",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-79dfe3",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-3d1b1f",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-42e12e",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190722Z-9b3683",
  "org.scalablytyped" %%% "graphql-extensions" % "0.9.2-d56564",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-e24098",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.5-5a6bad",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190812Z-0b7929",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-2d2be7",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-21a720",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-c877f7",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-7025bc",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-b87c0a",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-6da2a4",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-c74167",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190805Z-e0b8b6",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.19-4a2209")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        