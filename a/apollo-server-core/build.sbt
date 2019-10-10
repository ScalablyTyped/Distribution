organization := "org.scalablytyped"
name := "apollo-server-core"
version := "2.9.5-bb150d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-93a6c5",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.4-914a71",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.3-733208",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.6-6b625c",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.0-5c192e",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-eb52ae",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-3d79f9",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-8beed2",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.3-927783",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.4-29af9b",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.4-e73dbe",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.0-514321",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-345eb9",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-aabbef",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-db6ee1",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-88e72c",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-04d977",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-3b7640",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-dff786",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-a48880",
  "org.scalablytyped" %%% "graphql" % "14.5.8-ae2a8e",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.3-e811c0",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.5-8a0c37",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-8d7400",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-6958e3",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190925Z-edb300",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-51ab0c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-8637fd",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-d60ad2",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-0d10b5",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-e134e0",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-382e29",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-9e4cb7",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-569cc1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        