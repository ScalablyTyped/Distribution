organization := "org.scalablytyped"
name := "apollo-engine-reporting"
version := "0.2.0-07d1c5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.2.0-1af0ad",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-1491ac",
  "org.scalablytyped" %%% "async-retry" % "1.2-dt-20180601Z-42ddd4",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181231Z-d3e2e1",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-5a27ec",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-3de878",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-ba4b99",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-959624",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-4cbd9a",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-e150cf",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-0743f6",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-777313",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-494ba5",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-e0366f",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-add352",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-339b33",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-6dadc2",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-1db5b2",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180214Z-e1edf0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        