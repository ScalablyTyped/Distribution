organization := "org.scalablytyped"
name := "apollo-server-express"
version := "2.8.0-ac22f8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.1-28a5af",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.1-edceaf",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.2-756bc8",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.0-c6f06d",
  "org.scalablytyped" %%% "apollo-link" % "1.2.12-16bcb2",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-a37b56",
  "org.scalablytyped" %%% "apollo-server-core" % "2.8.0-e40724",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.1-b6f3b7",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.1-e7b445",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.1-2057ff",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.1-858381",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.0-50eec6",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-f16695",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-d89a50",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-ee50f3",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190425Z-584b57",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-f2f8bb",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-083460",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190717Z-df4cf9",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190722Z-fd24a4",
  "org.scalablytyped" %%% "graphql-extensions" % "0.9.0-f5d3fb",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-180b44",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.5-7862ab",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-85a68c",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190717Z-f93e3e",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-4c5b4d",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-223eff",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-00865d",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-16a8f6",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-05baba",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.19-871dff")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        