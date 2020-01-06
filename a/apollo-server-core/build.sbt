organization := "org.scalablytyped"
name := "apollo-server-core"
version := "2.9.15-09dfbd"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-cbb841",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.10-4b5b14",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.4-ef5a71",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.13-d872ba",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.4-dc864d",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-092388",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.1-9d0235",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-a84bb3",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.4-4bc4df",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.10-51bdfd",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.10-936537",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.3-2fccf0",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.2-f625a4",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-a02e71",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-23cf38",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-003b73",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-9c55c1",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-29b1be",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-e86cd1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191220Z-f5dd1c",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-c68769",
  "org.scalablytyped" %%% "graphql" % "14.5.8-216385",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.9-78d06b",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.6-5cef9a",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-6c9f27",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20191226Z-e35051",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20191127Z-7c9dce",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20190322Z-f5dfe8",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-e32d86",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-b9f880",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-166e61",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-454481",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-13155f",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20191125Z-380026",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-f75794")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        