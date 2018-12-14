organization := "org.scalablytyped"
name := "aws-iot-device-sdk"
version := "2.1.0-dt-20180910Z-e0113f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-16da1a",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180910Z-e59389",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180910Z-ef18e7",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180910Z-1550a3",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-ab6005",
  "org.scalablytyped" %%% "mqtt" % "2.18.8-dfcc68",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-56d31e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180910Z-252c1f",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-d6dc77",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180910Z-98fbce",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180910Z-bb7698",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180910Z-ae9609")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        