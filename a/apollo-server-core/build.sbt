organization := "org.scalablytyped"
name := "apollo-server-core"
version := "2.9.8-6ec082"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-7f0c3e",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.5-26b55b",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.3-9225ef",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.7-eca1dd",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.1-32ae6a",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-f78773",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-fac4b7",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-e0cf17",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.4-4da521",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.5-a77a71",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.5-58e883",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.0-77b279",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-25484c",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-675d96",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-1971cc",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-65d47f",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-b69538",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-df008a",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191101Z-cdc4d1",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-a75c1f",
  "org.scalablytyped" %%% "graphql" % "14.5.8-bafd12",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.4-2912b2",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.6-a91b24",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-030f1f",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-215745",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20191107Z-0899ea",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-301fe0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-af407f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ebcbf",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-1c7f66",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-f579dd",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-b94d3a",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-685134")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        