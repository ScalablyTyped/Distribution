organization := "org.scalablytyped"
name := "apollo-engine-reporting"
version := "0.2.0-fb315c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.2.0-c1f915",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-360fbe",
  "org.scalablytyped" %%% "async-retry" % "1.2-dt-20180910Z-8267e5",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-6c0a30",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-17fe49",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-153ce0",
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
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180910Z-7e731a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        