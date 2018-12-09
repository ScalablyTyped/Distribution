organization := "org.scalablytyped"
name := "apollo-server-core"
version := "2.2.6-c303e9"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.3.3-bdf15f",
  "org.scalablytyped" %%% "apollo-datasource" % "0.2.1-cb6ab3",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "0.1.3-b6c719",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.1.0-8c6f98",
  "org.scalablytyped" %%% "apollo-env" % "0.2.5-c98495",
  "org.scalablytyped" %%% "apollo-link" % "1.2.4-d81515",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.2.1-1e67d9",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-ced963",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.2.0-43834f",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.1.6-ed355e",
  "org.scalablytyped" %%% "apollo-tracing" % "0.3.3-54c3cc",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.26-6eebd1",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.2.9-910515",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.6-3150a8",
  "org.scalablytyped" %%% "async-retry" % "1.2-dt-20180910Z-dd5db9",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180910Z-58846a",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180927Z-41c841",
  "org.scalablytyped" %%% "deprecated-decorator" % "0.1.6-049e25",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-c6d2c7",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-505dae",
  "org.scalablytyped" %%% "graphql-extensions" % "0.3.3-803ef0",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.0.0-ecec78",
  "org.scalablytyped" %%% "graphql-tag" % "2.10.0-90e1be",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.3-eeaab2",
  "org.scalablytyped" %%% "iterall" % "1.2.2-8bc400",
  "org.scalablytyped" %%% "json-stable-stringify" % "1.0-dt-20180910Z-2953d3",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-e3741e",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-387ddd",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180910Z-fa35eb",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-a76757",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-89b4f7",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-27957d",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-8b222a",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-bd1923",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-ce83b4",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-c51d9d",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-22a8a7",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-53afa0",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-b14493",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-6efed3",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-045d53",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-66fb80",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-e3ebb0",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180910Z-63d03b",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-ba3729",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180910Z-eebb62",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-671f25",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.11-74d34a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        