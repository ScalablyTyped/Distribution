organization := "org.scalablytyped"
name := "apollo-server-core"
version := "2.9.12-989224"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-87da9b",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.8-d9a86c",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.3-280073",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.10-5380ac",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.4-0a229c",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-aaa86d",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-11e239",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-b5f75a",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.4-63cfbc",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.8-565dbd",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.8-2019c6",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.3-1938e4",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.1-cc0e1f",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-dcb665",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-95873a",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-21f8e2",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-91fe67",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-74902e",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-a64687",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-102985",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-677ea4",
  "org.scalablytyped" %%% "graphql" % "14.5.8-933f73",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.7-e92210",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.6-ca9fe0",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-8662b7",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-ba4afa",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20191107Z-059d4d",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20190322Z-ae878f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-e84c0f",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-382692",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1b75dd",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-c3e43f",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-0578ae",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-a3e5cc",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-760cc5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        