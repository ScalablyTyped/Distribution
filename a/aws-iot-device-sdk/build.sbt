organization := "org.scalablytyped"
name := "aws-iot-device-sdk"
version := "2.1.0-dt-20180214Z-3214b2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-995a2b",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-7a8838",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-277b3e",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-4abda9",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-9fc7e9",
  "org.scalablytyped" %%% "mqtt" % "2.18.8-8ada62",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-744678",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-0d969a",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-d68739",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-eabe5e",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-35c46b",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-4dc92b",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-f91530",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-e11874")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        