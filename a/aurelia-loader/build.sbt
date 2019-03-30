organization := "org.scalablytyped"
name := "aurelia-loader"
version := "1.0.2-db0d91"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-9c33a7",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.2-da00e5",
  "org.scalablytyped" %%% "aurelia-path" % "1.1.3-cb5257",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        