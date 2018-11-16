organization := "com.scalablytyped"
name := "aurelia-loader"
version := "1.0.0-e97122"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "aurelia-metadata" % "1.0.4-f17f7c",
  "com.scalablytyped" %%% "aurelia-pal" % "1.8.0-c82b71",
  "com.scalablytyped" %%% "aurelia-path" % "1.1.1-c9e1f4",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        