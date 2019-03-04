organization := "org.scalablytyped"
name := "aurelia-loader"
version := "1.0.1-64c5e9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.5-6dabb5",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.1-0e4bd7",
  "org.scalablytyped" %%% "aurelia-path" % "1.1.2-45815e",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        