organization := "org.scalablytyped"
name := "apollo-server"
version := "2.12.0-6397b0"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-e5e455",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.9.1-4ce8e8",
  "org.scalablytyped" %%% "apollo-datasource" % "0.7.0-704585",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.7.1-e2552f",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.4-70c1d0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-691065",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.1-8cb469",
  "org.scalablytyped" %%% "apollo-server-core" % "2.12.0-da9d51",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-b91220",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.4.1-18e4d8",
  "org.scalablytyped" %%% "apollo-server-express" % "2.12.0-1c2233",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.7.1-6591e8",
  "org.scalablytyped" %%% "apollo-server-types" % "0.3.1-21b2b8",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.3-42037c",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.5-1c0549",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-90a457",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-777753",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200226Z-26d1e9",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20200331Z-650a48",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-344133",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20200225Z-31ee24",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-ed0351",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200331Z-79bd5c",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200323Z-88b703",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-ebf202",
  "org.scalablytyped" %%% "graphql" % "14.6.0-f78e99",
  "org.scalablytyped" %%% "graphql-extensions" % "0.11.1-3f6ec0",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-d10e0e",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.7-1bffc5",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-1769db",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20191226Z-c8bdc7",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20200327Z-b10031",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20200226Z-abc547",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-3b5426",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200225Z-e66ac9",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ae0c0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200227Z-e748ee",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-1862b1",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200318Z-b44f72",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-09c27c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
