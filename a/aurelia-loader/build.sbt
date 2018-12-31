organization := "org.scalablytyped"
name := "aurelia-loader"
version := "1.0.0-45326b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.4-4d658c",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.0-a063fd",
  "org.scalablytyped" %%% "aurelia-path" % "1.1.1-035fa3",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        