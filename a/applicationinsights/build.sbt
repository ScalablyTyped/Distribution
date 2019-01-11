organization := "org.scalablytyped"
name := "applicationinsights"
version := "1.0.8-32b249"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "diagnostic-channel" % "0.2.0-ace0d9",
  "org.scalablytyped" %%% "diagnostic-channel-publishers" % "0.2.1-790c5a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-9e6585",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "zone_dot_js" % "0.8.27-e4baec")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        