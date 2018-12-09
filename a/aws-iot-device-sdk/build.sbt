organization := "org.scalablytyped"
name := "aws-iot-device-sdk"
version := "2.1.0-dt-20180910Z-e770f0"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-1ae617",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180910Z-8b668b",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180910Z-561249",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180910Z-ef9f89",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-18660e",
  "org.scalablytyped" %%% "mqtt" % "2.18.8-a42475",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-56290f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180910Z-1d8151",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-30258f",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180910Z-14dffe",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180910Z-eebb62",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180910Z-f9e671")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        