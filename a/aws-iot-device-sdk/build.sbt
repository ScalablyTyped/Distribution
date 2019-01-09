organization := "org.scalablytyped"
name := "aws-iot-device-sdk"
version := "2.1.0-dt-20180214Z-e4bc56"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-6cc674",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-ca3d5f",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-4dd1af",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-67a784",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-86ee84",
  "org.scalablytyped" %%% "mqtt" % "2.18.8-745f04",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-712822",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-f08beb",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-67b6d7",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-0d1281",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-d427a8",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-ee4fde",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-025112")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        