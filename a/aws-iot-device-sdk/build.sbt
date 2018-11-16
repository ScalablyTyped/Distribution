organization := "com.scalablytyped"
name := "aws-iot-device-sdk"
version := "2.1.0-dt-20181102Z-ac8062"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bl" % "v2.1.0-dt-20181102Z-6d67ad",
  "com.scalablytyped" %%% "concat-stream" % "1.6-dt-20181102Z-570a88",
  "com.scalablytyped" %%% "end-of-stream" % "1.4-dt-20181102Z-27b99a",
  "com.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20181102Z-8e587b",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20181102Z-8bed80",
  "com.scalablytyped" %%% "mqtt" % "2.18.8-f9bb0f",
  "com.scalablytyped" %%% "mqtt-packet" % "5.6.0-f448ad",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "pump" % "1.0-dt-20181102Z-87107b",
  "com.scalablytyped" %%% "safe-buffer" % "5.1.2-35bf73",
  "com.scalablytyped" %%% "split2" % "2.1.0-dt-20181102Z-9e351d",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "ws" % "6.0-dt-20181102Z-6a247d",
  "com.scalablytyped" %%% "xtend" % "4.0.1-dt-20181102Z-5bd065",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        