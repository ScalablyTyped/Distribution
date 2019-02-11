organization := "org.scalablytyped"
name := "aws-iot-device-sdk"
version := "2.1.0-dt-20180214Z-bc7d99"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-ac3a11",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-98b7f3",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-d2a37f",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-53748f",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-9fc7e9",
  "org.scalablytyped" %%% "mqtt" % "2.18.8-2ed584",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-b45d60",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-3468e4",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-0dfbf3",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-be1ed3",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-47c9ab",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-1d6ac6",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-4bd800",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-e11874")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        