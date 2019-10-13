organization := "org.scalablytyped"
name := "apollo-server"
version := "2.9.6-85c6d6"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-1fdfc6",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.5-2b6e07",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.3-2fbd77",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.7-b7d7b0",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.1-b49b3e",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-05736d",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-d1718e",
  "org.scalablytyped" %%% "apollo-server-core" % "2.9.6-af5028",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-6baeb7",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.3-b6a6bf",
  "org.scalablytyped" %%% "apollo-server-express" % "2.9.6-036239",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.5-04f26d",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.5-3fe199",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.0-11a727",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-9f943f",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-a83d81",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-e438a4",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-aba9d8",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190819Z-49f22f",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-dd73fa",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-e44937",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-a3652a",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-2c0262",
  "org.scalablytyped" %%% "graphql" % "14.5.8-9a82b3",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.4-45614f",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-279841",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.5-93dc69",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-d2161e",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-1dd753",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190925Z-00121b",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-8e1e66",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-c62b25",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-b8febd",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c44ea2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-84f8ef",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-55feed",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-9bab89",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-fe506f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        