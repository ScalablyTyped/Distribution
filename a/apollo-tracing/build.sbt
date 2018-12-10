organization := "org.scalablytyped"
name := "apollo-tracing"
version := "0.3.3-44b074"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.3.3-3011e5",
  "org.scalablytyped" %%% "apollo-datasource" % "0.2.1-b88562",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "0.1.3-c0208b",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.1.0-6b5175",
  "org.scalablytyped" %%% "apollo-env" % "0.2.5-89be6e",
  "org.scalablytyped" %%% "apollo-link" % "1.2.4-5ebd88",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.2.1-daf44d",
  "org.scalablytyped" %%% "apollo-server-core" % "2.2.6-b8b5fd",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-2990fb",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.2.0-23ff48",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.1.6-474762",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.26-7c4334",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.2.9-2a2946",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.6-f0c8d3",
  "org.scalablytyped" %%% "async-retry" % "1.2-dt-20180910Z-305986",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180910Z-57f2af",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180927Z-2f8c45",
  "org.scalablytyped" %%% "deprecated-decorator" % "0.1.6-a5e214",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-1206f1",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-1de855",
  "org.scalablytyped" %%% "graphql-extensions" % "0.3.3-f22247",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.0.0-1a9351",
  "org.scalablytyped" %%% "graphql-tag" % "2.10.0-edcafa",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.3-47f2cb",
  "org.scalablytyped" %%% "iterall" % "1.2.2-0da489",
  "org.scalablytyped" %%% "json-stable-stringify" % "1.0-dt-20180910Z-6ca13b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-3aa15f",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180910Z-9f29f5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-ebe499",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-f98d31",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-cf39e8",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-d7cd87",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-a2281d",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-eacc8a",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-9682d2",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-1d2334",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-fec06d",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-e6bd96",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-c28576",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-21ec1b",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-a8e3be",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-343133",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180910Z-1eb4cb",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-07b459",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180910Z-ba9141",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-6efe62",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.11-b2ad40")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        