organization := "org.scalablytyped"
name := "apollo-server-core"
version := "2.9.12-f57aa4"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-70b5a2",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.8-f8a295",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.3-280073",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.10-1cc5da",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.4-0a229c",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-aaa86d",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-11e239",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-66cb00",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.4-63cfbc",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.8-dc097d",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.8-1411fc",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.3-1938e4",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.1-cc0e1f",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-dcb665",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-9b6106",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-ec07f0",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-d48710",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-74902e",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-13b33a",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-da006c",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-d968ea",
  "org.scalablytyped" %%% "graphql" % "14.5.8-933f73",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.7-1aca43",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.6-ca9fe0",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-b7f80f",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-ba4afa",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20191107Z-ac68aa",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20190322Z-ae878f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-e84c0f",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191125Z-959704",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1b75dd",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-335844",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-4c1073",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20191125Z-b308ec",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-760cc5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        