organization := "org.scalablytyped"
name := "aurelia-loader"
version := "1.0.1-97f0b5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.5-1d0978",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.1-e402c1",
  "org.scalablytyped" %%% "aurelia-path" % "1.1.2-acabaf",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        