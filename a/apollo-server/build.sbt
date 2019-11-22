organization := "org.scalablytyped"
name := "apollo-server"
version := "2.9.12-7d4d57"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-68f05e",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.8-637b17",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.3-9225ef",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.10-ebe472",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.4-9587e4",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-f78773",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-fac4b7",
  "org.scalablytyped" %%% "apollo-server-core" % "2.9.12-547714",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-e7c605",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.4-4da521",
  "org.scalablytyped" %%% "apollo-server-express" % "2.9.12-e8e67b",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.8-ba721a",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.8-dcc334",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.3-b8e6ba",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.1-c47c4b",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-25484c",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-651b1b",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-025d27",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-d6da34",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190819Z-e8a4db",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-b69538",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-e9b754",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-5f40d1",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-ab070f",
  "org.scalablytyped" %%% "graphql" % "14.5.8-bafd12",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.7-1504ed",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-759dee",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.6-a91b24",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-5c1f55",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-215745",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20191107Z-3dde95",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20190322Z-f5282e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-301fe0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191119Z-94c257",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ebcbf",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-aab1df",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-70c280",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-7f8b0a",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-685134")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        