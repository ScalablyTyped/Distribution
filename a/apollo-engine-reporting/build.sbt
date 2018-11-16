organization := "com.scalablytyped"
name := "apollo-engine-reporting"
version := "0.0.6-5da9bf"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.0.1-996d02",
  "com.scalablytyped" %%% "apollo-server-env" % "2.0.3-6c8a83",
  "com.scalablytyped" %%% "async-retry" % "1.2-dt-20181102Z-2afbf3",
  "com.scalablytyped" %%% "graphql" % "14.0-dt-20181102Z-c82035",
  "com.scalablytyped" %%% "graphql-extensions" % "0.2.1-04978f",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181109Z-67570f",
  "com.scalablytyped" %%% "long" % "4.0.0-dt-20181102Z-eca052",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "node-fetch" % "2.1-dt-20181116Z-b7ed5a",
  "com.scalablytyped" %%% "protobufjs" % "6.8.8-4227a4",
  "com.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-0bb450",
  "com.scalablytyped" %%% "protobufjs__base64" % "1.1.2-66e78b",
  "com.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-f5e12a",
  "com.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-0cf4aa",
  "com.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-ce8b6f",
  "com.scalablytyped" %%% "protobufjs__float" % "1.0.2-7bf595",
  "com.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-4b6e52",
  "com.scalablytyped" %%% "protobufjs__path" % "1.1.2-7cea48",
  "com.scalablytyped" %%% "protobufjs__pool" % "1.1.0-c4603f",
  "com.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-d6356e",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20181102Z-4b357b",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        