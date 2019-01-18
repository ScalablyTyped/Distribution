organization := "org.scalablytyped"
name := "angular-signalr-hub"
version := "v1.5.0-dt-20180214Z-cdfe95"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20181217Z-6e38d5",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-f7f24f",
  "org.scalablytyped" %%% "signalr" % "2.2.0-dt-20180214Z-cac8ac",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-b20ceb",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        