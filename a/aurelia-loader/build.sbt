organization := "org.scalablytyped"
name := "aurelia-loader"
version := "1.0.0-81d9e9"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.4-b2a725",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.0-84932f",
  "org.scalablytyped" %%% "aurelia-path" % "1.1.1-3dceaf",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        