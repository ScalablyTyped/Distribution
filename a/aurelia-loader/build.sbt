organization := "com.scalablytyped"
name := "aurelia-loader"
version := "1.0.0-045870"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "aurelia-metadata" % "1.0.4-6ad5fe",
  "com.scalablytyped" %%% "aurelia-pal" % "1.8.0-27f003",
  "com.scalablytyped" %%% "aurelia-path" % "1.1.1-ab81ef",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        