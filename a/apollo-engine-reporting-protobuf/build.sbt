organization := "org.scalablytyped"
name := "apollo-engine-reporting-protobuf"
version := "0.2.1-6ed332"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-d4ffb6",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-0239dd",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-a03f5d",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-86ab76",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-86ed03",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-04aaa9",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-a2cc95",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-4b38c0",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-f020d2",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-ae7ee1",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-f0cb50",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-225760",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        