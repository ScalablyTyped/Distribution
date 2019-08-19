organization := "org.scalablytyped"
name := "apollo-server"
version := "2.8.1-01b741"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-ae4183",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.1-9193e4",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.1-c0f7ef",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.3-e02917",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.0-dc2d6d",
  "org.scalablytyped" %%% "apollo-link" % "1.2.12-8d970c",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-595810",
  "org.scalablytyped" %%% "apollo-server-core" % "2.8.1-2c920d",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.1-0c8051",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.1-b52fbc",
  "org.scalablytyped" %%% "apollo-server-express" % "2.8.1-8c503b",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.1-ba5e24",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.1-f95c4b",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.0-deb43b",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-2339ba",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-0f462b",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-8e708a",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-2d0e0d",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190819Z-6c2342",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-ea4c05",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-381ce5",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-aba9aa",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-d07232",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190722Z-9b3683",
  "org.scalablytyped" %%% "graphql-extensions" % "0.9.1-386f6f",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-2dba76",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.5-5a6bad",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190812Z-b9659b",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-2d2be7",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-8c12f5",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-c877f7",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-2dc4df",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-7025bc",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-b87c0a",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-c4d375",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-330a63",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190805Z-9a238e",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.19-4a2209")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        