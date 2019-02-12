organization := "org.scalablytyped"
name := "aws-iot-device-sdk"
version := "2.1.0-dt-20180214Z-93cb15"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-29174e",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-660f04",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-441e8b",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-d0a223",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-9fc7e9",
  "org.scalablytyped" %%% "mqtt" % "2.18.8-33e726",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-a34614",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-fe520a",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-2e0f1a",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-97c4bb",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-2622bf",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-d781e3",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-e11874")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        