organization := "com.scalablytyped"
name := "aurelia-loader"
version := "1.0.0-266e26"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "aurelia-metadata" % "1.0.4-ff9fdd",
  "com.scalablytyped" %%% "aurelia-pal" % "1.8.0-c825ad",
  "com.scalablytyped" %%% "aurelia-path" % "1.1.1-515b38",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        