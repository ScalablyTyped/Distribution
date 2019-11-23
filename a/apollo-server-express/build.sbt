organization := "org.scalablytyped"
name := "apollo-server-express"
version := "2.9.12-7086be"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-e4863f",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.8-1997f0",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.3-9225ef",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.10-e3abf8",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.4-9587e4",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-f78773",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-fac4b7",
  "org.scalablytyped" %%% "apollo-server-core" % "2.9.12-bb5e73",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-e1bc21",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.4-4da521",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.8-a207af",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.8-1a7245",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.3-b8e6ba",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.1-c47c4b",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-25484c",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-b36108",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-a0f3dc",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-fe9222",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190819Z-36168e",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-b69538",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-24df32",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-4dd221",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-287333",
  "org.scalablytyped" %%% "graphql" % "14.5.8-bafd12",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.7-6f9ebc",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-65b9eb",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.6-a91b24",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-e9e065",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-215745",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20191107Z-ef73cd",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20190322Z-f5282e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-301fe0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-304e79",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ebcbf",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-37db83",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-fd5750",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-addeeb",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-685134")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        