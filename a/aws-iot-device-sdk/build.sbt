organization := "com.scalablytyped"
name := "aws-iot-device-sdk"
version := "2.1.0-dt-20180910Z-8b5c26"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-0f3539",
  "com.scalablytyped" %%% "concat-stream" % "1.6-dt-20180910Z-4feaf3",
  "com.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180910Z-00b966",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180910Z-4d428d",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-dd566d",
  "com.scalablytyped" %%% "mqtt" % "2.18.8-caece9",
  "com.scalablytyped" %%% "mqtt-packet" % "5.6.0-d2eafd",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "pump" % "1.0-dt-20180910Z-ff303f",
  "com.scalablytyped" %%% "safe-buffer" % "5.1.2-b48ea1",
  "com.scalablytyped" %%% "split2" % "2.1.0-dt-20180910Z-2b234c",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "ws" % "6.0-dt-20180910Z-e85d1f",
  "com.scalablytyped" %%% "xtend" % "4.0.1-dt-20180910Z-a53ca1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        