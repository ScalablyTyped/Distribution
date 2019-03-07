organization := "org.scalablytyped"
name := "aws-iot-device-sdk"
version := "2.2.0-dt-20190223Z-d772fa"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-482516",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-8d5253",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-788070",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-b297c4",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-5de375",
  "org.scalablytyped" %%% "mqtt" % "2.18.8-05022b",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-10b7d9",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-4e6000",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-34cfd1",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-65f44d",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-21fab4",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-9b5bdf",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-750ba0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        