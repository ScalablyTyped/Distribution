organization := "org.scalablytyped"
name := "apollo-server-core"
version := "2.3.1-5ab158"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.4.0-e71a69",
  "org.scalablytyped" %%% "apollo-datasource" % "0.2.1-42d593",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "0.2.0-8919f1",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.2.0-cae812",
  "org.scalablytyped" %%% "apollo-env" % "0.2.5-310fed",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-65536a",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.2.1-e38e05",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-68d1c1",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.2.0-c69613",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.2.1-c5c393",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-52f69b",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.2.9-2d9923",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.6-5054ca",
  "org.scalablytyped" %%% "async-retry" % "1.2-dt-20180601Z-1019d7",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180601Z-5aca12",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-ec75e2",
  "org.scalablytyped" %%% "deprecated-decorator" % "0.1.6-c4025e",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-f1fa89",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-353ee5",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181016Z-ed78a4",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.0.0-2f34db",
  "org.scalablytyped" %%% "graphql-tag" % "2.10.0-232e70",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.3-91d8bf",
  "org.scalablytyped" %%% "iterall" % "1.2.2-1d5c18",
  "org.scalablytyped" %%% "json-stable-stringify" % "1.0-dt-20180214Z-df6f22",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-0a02fb",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-c30cf6",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-90c559",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-3aadd3",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-770897",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-c931e6",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-5e843a",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-30774a",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-592e97",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-e194a5",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-9d3553",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-1d4f93",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-35f35b",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-eddee7",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-946a5f",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-0ce6d9",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-dc48cb",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180214Z-2df8c3",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-34dde2",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-5fcabc",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-9c6819",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-80038a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        