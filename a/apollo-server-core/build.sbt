organization := "org.scalablytyped"
name := "apollo-server-core"
version := "2.3.2-5255c6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-datasource" % "0.2.2-69ff19",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "0.2.1-04d780",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.2.0-bdc8ed",
  "org.scalablytyped" %%% "apollo-env" % "0.3.0-6907f8",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-dc6387",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.2.2-2a3504",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-76bcb3",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.2.0-0b5ebe",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.2.2-329388",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-c9719d",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.3.0-c433f1",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.6-692cde",
  "org.scalablytyped" %%% "async-retry" % "1.2-dt-20180601Z-1b4997",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180601Z-ac0ced",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-8101a4",
  "org.scalablytyped" %%% "deprecated-decorator" % "0.1.6-7670bf",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-c99994",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-c8d4b8",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190107Z-b6e998",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.0.0-28bfbe",
  "org.scalablytyped" %%% "graphql-tag" % "2.10.0-d87042",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-df4844",
  "org.scalablytyped" %%% "iterall" % "1.2.2-670785",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-c48db4",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-99178b",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-60874b",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-d86f0f",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-e01f75",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-14f98a",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-3c3a8c",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-3e5519",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-c6fcbc",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-b178af",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-9e97a1",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-922b9f",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-87da94",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-9eee98",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-2cdf20",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-7570aa",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-bc5916",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180214Z-0f5ab0",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-8c9d6d",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-b71b65",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-5cf802",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-e9f354")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        