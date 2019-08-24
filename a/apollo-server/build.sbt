organization := "org.scalablytyped"
name := "apollo-server"
version := "2.9.0-f822fe"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-fe708f",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.8.1-13014c",
  "org.scalablytyped" %%% "apollo-datasource" % "0.6.1-2b853f",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.4.3-759658",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.0-3d2732",
  "org.scalablytyped" %%% "apollo-link" % "1.2.12-f86490",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-553b94",
  "org.scalablytyped" %%% "apollo-server-core" % "2.9.0-7fdef5",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.1-46a101",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.1-6f5ff4",
  "org.scalablytyped" %%% "apollo-server-express" % "2.9.0-bfd0ae",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.6.1-b29926",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.1-e09ad2",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.4.0-b7b2ff",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.24-487820",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-234f40",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-8f9eda",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-a81a50",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190819Z-d699f0",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-32acc9",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-79dfe3",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-3d1b1f",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-42e12e",
  "org.scalablytyped" %%% "graphql" % "14.5.3-be513a",
  "org.scalablytyped" %%% "graphql-extensions" % "0.10.0-591b36",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-62a306",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.5-f01933",
  "org.scalablytyped" %%% "graphql-upload" % "8.0-dt-20190823Z-c30194",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-2d2be7",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-21a720",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-c877f7",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-21aebd",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-b87c0a",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-6da2a4",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-08b8ea",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-a1e22f",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.19-002886")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        