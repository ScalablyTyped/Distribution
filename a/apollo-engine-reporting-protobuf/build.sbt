organization := "org.scalablytyped"
name := "apollo-engine-reporting-protobuf"
version := "0.1.0-53f042"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-76729d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-e1d881",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-9b70f4",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-2605b5",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-8a3782",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-000df5",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-ddce07",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-be31e2",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-b25b54",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-b26c77",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-ddd0b7",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-c727dc",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        