organization := "com.scalablytyped"
name := "apollo-server-core"
version := "2.1.0-7dd938"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "apollo-cache-control" % "0.2.5-d4ef10",
  "com.scalablytyped" %%% "apollo-datasource" % "0.1.3-c24435",
  "com.scalablytyped" %%% "apollo-engine-reporting" % "0.0.6-8d251e",
  "com.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.0.1-1bd956",
  "com.scalablytyped" %%% "apollo-link" % "1.2.3-ed789a",
  "com.scalablytyped" %%% "apollo-server-caching" % "0.1.2-2acd39",
  "com.scalablytyped" %%% "apollo-server-env" % "2.0.3-ad548d",
  "com.scalablytyped" %%% "apollo-server-errors" % "2.0.2-a3fc2a",
  "com.scalablytyped" %%% "apollo-tracing" % "0.2.5-7727ca",
  "com.scalablytyped" %%% "apollo-utilities" % "1.0.21-6af781",
  "com.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.0-255b4b",
  "com.scalablytyped" %%% "async-retry" % "1.2-dt-20180910Z-a30bd8",
  "com.scalablytyped" %%% "backo2" % "1.0-dt-20180910Z-907b56",
  "com.scalablytyped" %%% "deprecated-decorator" % "0.1.6-c0ab4d",
  "com.scalablytyped" %%% "eventemitter3" % "3.1.0-445710",
  "com.scalablytyped" %%% "fclone" % "1.0.11-4304d4",
  "com.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-4871a9",
  "com.scalablytyped" %%% "graphql-extensions" % "0.2.1-8f7e9f",
  "com.scalablytyped" %%% "graphql-subscriptions" % "0.5.8-8da9a7",
  "com.scalablytyped" %%% "graphql-tag" % "2.10.0-b79734",
  "com.scalablytyped" %%% "graphql-tools" % "4.0.2-a93493",
  "com.scalablytyped" %%% "hash_dot_js" % "1.1.5-bc04ef",
  "com.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180910Z-2282cd",
  "com.scalablytyped" %%% "iterall" % "1.2.2-770ade",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-caf0c5",
  "com.scalablytyped" %%% "lodash_dot_assign" % "4.2-dt-20180910Z-972791",
  "com.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20180910Z-eb876c",
  "com.scalablytyped" %%% "lodash_dot_isstring" % "4.0-dt-20180910Z-d0342e",
  "com.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-ace41c",
  "com.scalablytyped" %%% "lru-cache" % "4.1-dt-20180910Z-02fd9c",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-5a910f",
  "com.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-de4761",
  "com.scalablytyped" %%% "protobufjs" % "6.8.8-6842ae",
  "com.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-2c7cd8",
  "com.scalablytyped" %%% "protobufjs__base64" % "1.1.2-2c8f62",
  "com.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-63e3a1",
  "com.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-03b0c2",
  "com.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-2abc1b",
  "com.scalablytyped" %%% "protobufjs__float" % "1.0.2-960bf5",
  "com.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-e8e70d",
  "com.scalablytyped" %%% "protobufjs__path" % "1.1.2-c48b13",
  "com.scalablytyped" %%% "protobufjs__pool" % "1.1.0-2fb531",
  "com.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-0af194",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.8-138d2d",
  "com.scalablytyped" %%% "symbol-observable" % "1.2.0-e6336c",
  "com.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180910Z-b2e03f",
  "com.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-4852fd",
  "com.scalablytyped" %%% "ws" % "6.0-dt-20180910Z-0d0df0",
  "com.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-2ae465",
  "com.scalablytyped" %%% "zen-observable-ts" % "0.8.10-36203d",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        