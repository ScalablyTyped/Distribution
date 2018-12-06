organization := "org.scalablytyped"
name := "aurelia-loader"
version := "1.0.0-ef3ba4"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.4-fb3c81",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.0-fa3a3e",
  "org.scalablytyped" %%% "aurelia-path" % "1.1.1-3f2465",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        