organization := "org.scalablytyped"
name := "apollo-server-express"
version := "2.9.1-5d64bf"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-147721",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.2-8a1a79",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.2-0bc08d",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.4-fc93c7",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.0-4a2a3e",
  "org.scalablytyped" %%% "apollo-link" % "1.2.12-4d60e6",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-a17842",
  "org.scalablytyped" %%% "apollo-server-core" % "2.9.1-c4ca26",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.2-5b69e2",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.2-b1eedd",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.2-06c0fc",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.2-78b5ba",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.0-bee03d",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-73113c",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-105136",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-517334",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-ed9347",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190819Z-0b753b",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-ec25ff",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-676404",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-f1a335",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-a9a398",
  "org.scalablytyped" %%% "graphql" % "14.5.4-73f550",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.1-13441f",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-3fbc36",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.5-3eda9d",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-86cfd1",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-9360b6",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-cb6875",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-612693",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-c250b3",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-e83d9b",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-db4fa8",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-2a850b",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-f75f56",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-18ae8a",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.19-8a9e63")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        