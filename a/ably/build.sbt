organization := "org.scalablytyped"
name := "ably"
version := "1.1.5-5c0536"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-197130",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-e66f03",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-21f55d",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-3a715e",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-258a45")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        