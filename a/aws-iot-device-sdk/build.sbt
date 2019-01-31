organization := "org.scalablytyped"
name := "aws-iot-device-sdk"
version := "2.1.0-dt-20180214Z-08d40f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-d9ced4",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-39c8e8",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-4abbb9",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-c7aec7",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-fff6c3",
  "org.scalablytyped" %%% "mqtt" % "2.18.8-712db0",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-baf25c",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-40209e",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-a4008c",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-78801a",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-ba3926",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-230442",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-0360c5",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-996100")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        