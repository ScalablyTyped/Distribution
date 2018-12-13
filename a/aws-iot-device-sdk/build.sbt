organization := "org.scalablytyped"
name := "aws-iot-device-sdk"
version := "2.1.0-dt-20180910Z-6278ea"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-c6286c",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180910Z-330eec",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180910Z-2aa567",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180910Z-c2ab7e",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-aae1f0",
  "org.scalablytyped" %%% "mqtt" % "2.18.8-08491f",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-5fef48",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180910Z-1cdfcb",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-1e3085",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180910Z-4bf005",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180910Z-7a5584",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180910Z-152227")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        