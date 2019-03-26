organization := "org.scalablytyped"
name := "aws-iot-device-sdk"
version := "2.2.0-dt-20190322Z-a35adb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20190322Z-7abbe7",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-2668f0",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-7240e5",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20190322Z-2a9acd",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-2ad77d",
  "org.scalablytyped" %%% "mqtt" % "2.18.8-399d94",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-e17cce",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-29059d",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-889e65",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-1895d1",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20190322Z-32ce16",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-329e67",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20190322Z-565603")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        