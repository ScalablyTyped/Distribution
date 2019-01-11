organization := "org.scalablytyped"
name := "aurelia-loader"
version := "1.0.0-a0bfc4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.4-428fac",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.0-9ad621",
  "org.scalablytyped" %%% "aurelia-path" % "1.1.1-2dcce4",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        