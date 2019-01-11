organization := "org.scalablytyped"
name := "aws-iot-device-sdk"
version := "2.1.0-dt-20180214Z-1c8e5e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-577cef",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-79d07a",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-7c1710",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-6c501f",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-fcc4b6",
  "org.scalablytyped" %%% "mqtt" % "2.18.8-4c8e62",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-307908",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-a3d394",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-3ad3b2",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-3095ce",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-1b304f",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-641db8",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-98e003")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        