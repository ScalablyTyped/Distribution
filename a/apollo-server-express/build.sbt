organization := "org.scalablytyped"
name := "apollo-server-express"
version := "2.8.1-caba5f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-6d8609",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.1-749912",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.1-edceaf",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.3-ec1501",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.0-c6f06d",
  "org.scalablytyped" %%% "apollo-link" % "1.2.12-16bcb2",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-a37b56",
  "org.scalablytyped" %%% "apollo-server-core" % "2.8.1-8e0530",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.1-54b031",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.1-e7b445",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.1-30f30a",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.1-63d76b",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.0-50eec6",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-f16695",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-2ae511",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-05f2a9",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-4e7246",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190425Z-89518a",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-f2f8bb",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-cbb478",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190717Z-5afe6e",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-cb5f16",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190722Z-fd24a4",
  "org.scalablytyped" %%% "graphql-extensions" % "0.9.1-1c8ca1",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-2e756d",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.5-7862ab",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190812Z-73e266",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-6f6992",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-618a1c",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-85a68c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-317602",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-4c5b4d",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-223eff",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-010b16",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-ecec6c",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190805Z-704be2",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.19-871dff")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        