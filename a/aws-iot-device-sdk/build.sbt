organization := "org.scalablytyped"
name := "aws-iot-device-sdk"
version := "2.2.0-dt-20190223Z-365c53"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-c6c071",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-e12bf7",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-a36217",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-22c1c5",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-5de375",
  "org.scalablytyped" %%% "mqtt" % "2.18.8-e338ff",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-5ccc8f",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-4545c8",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-935d9f",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-0a9f78",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-6798f8",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-d82b7c",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-750ba0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        