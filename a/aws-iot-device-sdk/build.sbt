organization := "org.scalablytyped"
name := "aws-iot-device-sdk"
version := "2.1.0-dt-20180214Z-3608f2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-e0eda3",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-19408b",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-d95bf5",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-4e261e",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-fff6c3",
  "org.scalablytyped" %%% "mqtt" % "2.18.8-4fddc0",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-efd3ae",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-f3b163",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-e7bb58",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-42aadd",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-0abb05",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-b71b65",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-996100")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        