organization := "org.scalablytyped"
name := "aurelia-loader"
version := "1.0.0-3c68a4"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.4-ce5daf",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.0-c88d1b",
  "org.scalablytyped" %%% "aurelia-path" % "1.1.1-19fddd",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        