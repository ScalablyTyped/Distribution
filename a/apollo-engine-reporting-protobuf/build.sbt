organization := "org.scalablytyped"
name := "apollo-engine-reporting-protobuf"
version := "0.2.0-f91218"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-99178b",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-ed1824",
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
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        