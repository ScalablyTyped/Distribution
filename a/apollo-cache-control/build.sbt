organization := "org.scalablytyped"
name := "apollo-cache-control"
version := "0.4.1-7da339"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-datasource" % "0.2.2-f9a699",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "0.2.1-103326",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.2.0-ddcd97",
  "org.scalablytyped" %%% "apollo-env" % "0.3.2-0871b2",
  "org.scalablytyped" %%% "apollo-link" % "1.2.8-11755c",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.2.2-6a1d2d",
  "org.scalablytyped" %%% "apollo-server-core" % "2.3.3-d3f074",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-015948",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.2.0-32a1ef",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.2.3-9bdf3f",
  "org.scalablytyped" %%% "apollo-utilities" % "1.1.2-380657",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.3.2-2450dc",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.6-f2b579",
  "org.scalablytyped" %%% "async-retry" % "1.2-dt-20180601Z-028562",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180601Z-b1f74a",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-8a719e",
  "org.scalablytyped" %%% "deprecated-decorator" % "0.1.6-d4f8c7",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-72b90f",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-f8efaa",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190107Z-beaee2",
  "org.scalablytyped" %%% "graphql-extensions" % "0.4.2-696bf0",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.0.0-5f4046",
  "org.scalablytyped" %%% "graphql-tag" % "2.10.1-0e2c1c",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-be6a61",
  "org.scalablytyped" %%% "iterall" % "1.2.2-cf22a7",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-cf3a73",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-02eb4a",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-ac2bc3",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190130Z-d2c791",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-4186d9",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-e26d13",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-6367f2",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-8a9473",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-ee2249",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-b87ef3",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-e0df27",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-f2eb3d",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-7cc4d0",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-22c235",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-9c4942",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-dd1e0d",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-31ba1a",
  "org.scalablytyped" %%% "tslib" % "1.9.3-2d26d9",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180214Z-10c485",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-7c0b14",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-a4b6f7",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-6cdd80",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.15-0ed4ab")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        