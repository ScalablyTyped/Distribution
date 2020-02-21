organization := "org.scalablytyped"
name := "apollo-server-core"
version := "2.10.1-aa3bac"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-7c16b9",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.11-19bd8e",
  "org.scalablytyped" %%% "apollo-datasource" % "0.7.0-68daae",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.6.0-e0dfde",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.4-0227ac",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-aa671f",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.1-925e96",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-9bade7",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.4-ce0981",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.10-cf6321",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.10-46109f",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.3-cef0bf",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.3-32f396",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-fc41da",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-cc0ef5",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-07dbf2",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-d60826",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-9ad653",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-f4e6a1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200121Z-868c54",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-322cdb",
  "org.scalablytyped" %%% "graphql" % "14.6.0-800d77",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.10-9a4618",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.6-0718f3",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-937680",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20191226Z-ef55d8",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20200211Z-010306",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20200122Z-5ea517",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-4fb0bc",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-7c1dac",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-d83efd",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-b44279",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200129Z-69f918",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-17d6b8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
