organization := "com.scalablytyped"
name := "apollo-engine-reporting"
version := "0.0.6-8d251e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.0.1-1bd956",
  "com.scalablytyped" %%% "apollo-server-env" % "2.0.3-ad548d",
  "com.scalablytyped" %%% "async-retry" % "1.2-dt-20180910Z-a30bd8",
  "com.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-4871a9",
  "com.scalablytyped" %%% "graphql-extensions" % "0.2.1-8f7e9f",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-caf0c5",
  "com.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-ace41c",
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
  "com.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180910Z-b2e03f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        