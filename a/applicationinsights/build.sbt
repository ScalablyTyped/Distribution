organization := "com.scalablytyped"
name := "applicationinsights"
version := "1.0.6-0f4b77"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "diagnostic-channel" % "0.2.0-e9a82b",
  "com.scalablytyped" %%% "diagnostic-channel-publishers" % "0.2.1-edf0d1",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "semver" % "5.5-dt-20181102Z-92c73a",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "zone_dot_js" % "0.8.26-8642cc",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        