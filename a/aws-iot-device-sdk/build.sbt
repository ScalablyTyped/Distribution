organization := "org.scalablytyped"
name := "aws-iot-device-sdk"
version := "2.1.0-dt-20180910Z-7e3a60"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-e41004",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180910Z-d66d65",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180910Z-6d8005",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180910Z-d1304e",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-aae1f0",
  "org.scalablytyped" %%% "mqtt" % "2.18.8-c00393",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-09d042",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180910Z-2ecc5b",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-757e4a",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180910Z-e9d305",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180910Z-ba9141",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180910Z-152227")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        