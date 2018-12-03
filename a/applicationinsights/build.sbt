organization := "com.scalablytyped"
name := "applicationinsights"
version := "1.0.7-c45298"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "diagnostic-channel" % "0.2.0-d359d8",
  "com.scalablytyped" %%% "diagnostic-channel-publishers" % "0.2.1-da69c5",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-b64c1e",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "zone_dot_js" % "0.8.26-4c1d58",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        