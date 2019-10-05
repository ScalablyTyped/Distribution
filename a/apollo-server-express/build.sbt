organization := "org.scalablytyped"
name := "apollo-server-express"
version := "2.9.5-c0241a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-d94377",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.4-3a7bf9",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.3-733208",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.6-bed4e7",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.0-5c192e",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-eb52ae",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-3d79f9",
  "org.scalablytyped" %%% "apollo-server-core" % "2.9.5-4577c9",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-3651dd",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.3-927783",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.4-cdbfe6",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.4-798e2a",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.0-514321",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-345eb9",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-e27953",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-62c2b3",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-baa76c",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190819Z-789d9d",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-04d977",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-06675e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-8c6b3a",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-495b70",
  "org.scalablytyped" %%% "graphql" % "14.5.8-ae2a8e",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.3-6cf80d",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-c84b58",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.5-8a0c37",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190826Z-f22124",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-6958e3",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190925Z-5639e9",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-51ab0c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-a35ed6",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-d60ad2",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-0d10b5",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-f18a47",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-6583a0",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-7c8f95",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-569cc1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        