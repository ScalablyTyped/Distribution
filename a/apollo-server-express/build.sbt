organization := "org.scalablytyped"
name := "apollo-server-express"
version := "2.8.1-6c93c7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-bd77ba",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.1-8be123",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.1-edceaf",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.3-aa595a",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.0-c6f06d",
  "org.scalablytyped" %%% "apollo-link" % "1.2.12-16bcb2",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-a37b56",
  "org.scalablytyped" %%% "apollo-server-core" % "2.8.1-dade02",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.1-6b077a",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.1-e7b445",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.1-dccd70",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.1-0bb302",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.0-50eec6",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-f16695",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-e8e964",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-4a549d",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-a928f1",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190425Z-98c3cf",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-f2f8bb",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-057966",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190717Z-b72682",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190722Z-fd24a4",
  "org.scalablytyped" %%% "graphql-extensions" % "0.9.1-b3f4d8",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-b0ddd6",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.5-7862ab",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190513Z-9c6abc",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-6f6992",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-f85a2a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-85a68c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190807Z-ed4b3f",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-4c5b4d",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-223eff",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-c244ba",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-2aa410",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190805Z-7c34fc",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.19-871dff")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        