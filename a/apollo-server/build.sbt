organization := "org.scalablytyped"
name := "apollo-server"
version := "2.12.0-a1b506"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-faa220",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.9.1-7726a8",
  "org.scalablytyped" %%% "apollo-datasource" % "0.7.0-b55c0b",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.7.1-061241",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.4-2f54ec",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-d0a417",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.1-b472d8",
  "org.scalablytyped" %%% "apollo-server-core" % "2.12.0-65d3c6",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-ece472",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.4.1-1c95f3",
  "org.scalablytyped" %%% "apollo-server-express" % "2.12.0-1b412b",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.7.1-5a8a58",
  "org.scalablytyped" %%% "apollo-server-types" % "0.3.1-aa5127",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.3-672368",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.5-b9c235",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-ba6b28",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-e204eb",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200226Z-677666",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20200331Z-650a48",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-c7af76",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20200225Z-b99bf6",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-da1e84",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200409Z-704088",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200415Z-afdfd2",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-fa87ba",
  "org.scalablytyped" %%% "graphql" % "14.6.0-d18599",
  "org.scalablytyped" %%% "graphql-extensions" % "0.11.1-42a53b",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-fb6cd1",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.8-8927f3",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-593fbb",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20191226Z-74aed5",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20200327Z-6cad27",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20200226Z-571776",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-cd6086",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200225Z-6c439e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-0a8d6e",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200227Z-c88828",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-64c2a7",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200413Z-deeaca",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-c6e790")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
