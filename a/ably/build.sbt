organization := "org.scalablytyped"
name := "ably"
version := "1.1.6-ae7dd5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-bfb77c",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-7e85a9",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-b714b2",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-a689e5",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-329e67")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        