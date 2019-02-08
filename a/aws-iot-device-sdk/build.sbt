organization := "org.scalablytyped"
name := "aws-iot-device-sdk"
version := "2.1.0-dt-20180214Z-d23a38"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-9ac571",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-224c84",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-82567a",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-2aea94",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-9fc7e9",
  "org.scalablytyped" %%% "mqtt" % "2.18.8-5948bb",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-d26892",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-9f73ab",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-a2bfa5",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-ad4db2",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-3914b1",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-9181ac",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-734b83",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-e11874")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        