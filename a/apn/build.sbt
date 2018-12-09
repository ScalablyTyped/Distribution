organization := "org.scalablytyped"
name := "apn"
version := "2.2.0-6e1c6e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-42ca48",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181104Z-9f716a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20181204Z-e97669",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "verror" % "1.10-dt-20180910Z-0a822f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        