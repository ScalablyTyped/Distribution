organization := "org.scalablytyped"
name := "apollo-server-plugin-base"
version := "0.2.1-2d609e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.4.0-52e4bf",
  "org.scalablytyped" %%% "apollo-datasource" % "0.2.1-71febc",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "0.2.0-900e32",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.2.0-c1f915",
  "org.scalablytyped" %%% "apollo-env" % "0.2.5-6ccb23",
  "org.scalablytyped" %%% "apollo-link" % "1.2.4-b0ec7c",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.2.1-33c37f",
  "org.scalablytyped" %%% "apollo-server-core" % "2.3.1-279078",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-360fbe",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.2.0-7ac9fb",
  "org.scalablytyped" %%% "apollo-tracing" % "0.4.0-3917b9",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.26-062b35",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.2.9-ba95be",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.6-b2d41e",
  "org.scalablytyped" %%% "async-retry" % "1.2-dt-20180910Z-8267e5",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180910Z-57b385",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180927Z-3acce5",
  "org.scalablytyped" %%% "deprecated-decorator" % "0.1.6-4f02ad",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-0150b5",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-6c0a30",
  "org.scalablytyped" %%% "graphql-extensions" % "0.4.0-035c87",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.0.0-11da4c",
  "org.scalablytyped" %%% "graphql-tag" % "2.10.0-1c61be",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.3-cda9bc",
  "org.scalablytyped" %%% "iterall" % "1.2.2-4bf127",
  "org.scalablytyped" %%% "json-stable-stringify" % "1.0-dt-20180910Z-d696e9",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-17fe49",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-153ce0",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180910Z-91487f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-d32d36",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-e136ca",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-d3e3b2",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-d9ae65",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-d4193a",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-907098",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-407e0b",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-bc95c4",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-cf41d5",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-632fdf",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-ccad89",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-51b4ae",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-bafefb",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-f84511",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180910Z-7e731a",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-bc3f32",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180910Z-bb7698",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-962402",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.11-76cd5d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        