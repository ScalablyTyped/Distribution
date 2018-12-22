organization := "org.scalablytyped"
name := "aws-iot-device-sdk"
version := "2.1.0-dt-20180214Z-23abf3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-8a98d0",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-08b1e6",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-b30a35",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-d53016",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-077fe7",
  "org.scalablytyped" %%% "mqtt" % "2.18.8-321794",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-0876da",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-f2184d",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-144f42",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-421f9d",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-790def",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-d62b15")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        