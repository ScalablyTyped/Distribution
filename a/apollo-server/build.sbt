organization := "org.scalablytyped"
name := "apollo-server"
version := "2.11.0-aed164"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-ead483",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.9.0-e52fd1",
  "org.scalablytyped" %%% "apollo-datasource" % "0.7.0-704585",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.7.0-70a3fb",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.4-70c1d0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-691065",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.1-8cb469",
  "org.scalablytyped" %%% "apollo-server-core" % "2.11.0-744fa4",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-8c5447",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.4.0-d9d379",
  "org.scalablytyped" %%% "apollo-server-express" % "2.11.0-1ba533",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.7.0-52138e",
  "org.scalablytyped" %%% "apollo-server-types" % "0.3.0-5f637b",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.3-42037c",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.4-01fdb0",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-90a457",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-e73a63",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200226Z-269b22",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-b94e18",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20200225Z-013eee",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-ed0351",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200303Z-1c1293",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200225Z-dbe850",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-b8e85f",
  "org.scalablytyped" %%% "graphql" % "14.6.0-f78e99",
  "org.scalablytyped" %%% "graphql-extensions" % "0.11.0-656392",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-0aa69b",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.7-1bffc5",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-d11ea9",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20191226Z-c8bdc7",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20200226Z-c000e0",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20200226Z-abc547",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-3b5426",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ae0c0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200227Z-dc6343",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-c33551",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200318Z-620d0e",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-09c27c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
