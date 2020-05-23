organization := "org.scalablytyped"
name := "apollo-server-core"
version := "2.13.1-5739ce"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20200515Z-3e6292",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.10.1-alpha.0-bb1330",
  "org.scalablytyped" %%% "apollo-datasource" % "0.7.1-alpha.0-bf0980",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.8.1-alpha.0-1b3507",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.5.1-alpha.1-a99a58",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-a26a1b",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.1-32d1eb",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.4-alpha.0-67b908",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.4.1-4ecbec",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.8.1-alpha.0-3d5d51",
  "org.scalablytyped" %%% "apollo-server-types" % "0.4.1-alpha.0-2825b8",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.4-8c68b3",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.8-5a2aac",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-b99f97",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-5329e6",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200515Z-4db3c4",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20200515Z-bcd10f",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-b72608",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.4-292039",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200515Z-9eb2b7",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200515Z-c2bfc2",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-e8383b",
  "org.scalablytyped" %%% "graphql" % "14.6.0-2fa9e2",
  "org.scalablytyped" %%% "graphql-extensions" % "0.12.1-alpha.0-906cc3",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.8-91e34a",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-91dbd0",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20200515Z-0ee69b",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20200515Z-990721",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20200515Z-3b8d54",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200515Z-593c89",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200519Z-7ad812",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-cd197c",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200519Z-9da187",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-6210ce",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200413Z-19ac01",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-118859")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
