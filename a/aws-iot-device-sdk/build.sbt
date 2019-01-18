organization := "org.scalablytyped"
name := "aws-iot-device-sdk"
version := "2.1.0-dt-20180214Z-9ab75c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-ab6f74",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-88f17d",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-02b53c",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-387eb2",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-fff6c3",
  "org.scalablytyped" %%% "mqtt" % "2.18.8-7d3e05",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-6d54cd",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-0c1597",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-70cb56",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-bb2b16",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-4ee6ef",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-34fb49",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-996100")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        