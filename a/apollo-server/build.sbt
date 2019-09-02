organization := "org.scalablytyped"
name := "apollo-server"
version := "2.9.3-d8007f"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-5363f1",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.4-4e094c",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.3-9400c3",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.6-689d78",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.0-4a2a3e",
  "org.scalablytyped" %%% "apollo-link" % "1.2.12-4d60e6",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-a17842",
  "org.scalablytyped" %%% "apollo-server-core" % "2.9.3-edb1da",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-6588ee",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.3-f0e4b4",
  "org.scalablytyped" %%% "apollo-server-express" % "2.9.3-6ae15a",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.4-cd5149",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.4-91a420",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.0-bee03d",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-73113c",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-3bd41f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-bf387c",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-c0b9ec",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190819Z-7efe71",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-ec25ff",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-2bbbb8",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-0db06c",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-eb64ff",
  "org.scalablytyped" %%% "graphql" % "14.5.4-73f550",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.3-2e9c90",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-08e2dc",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.5-3eda9d",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-a4eaa3",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-9360b6",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-c166ec",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-612693",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190830Z-a302b7",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-e83d9b",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-db4fa8",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-a273f8",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-38bb9f",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-4e4590",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.19-8a9e63")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        