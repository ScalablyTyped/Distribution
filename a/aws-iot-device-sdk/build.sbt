organization := "org.scalablytyped"
name := "aws-iot-device-sdk"
version := "2.2.0-dt-20190322Z-14f49a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20190322Z-08cb49",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-3b2ea1",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-75e6bc",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20190322Z-8768f8",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-8cca44",
  "org.scalablytyped" %%% "mqtt" % "2.18.8-b10a92",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-6fa9b0",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-fdb770",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-30845c",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-cc6aa4",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20190322Z-971b49",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-20a177",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20190322Z-8e3fb4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        