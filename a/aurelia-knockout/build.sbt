organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.3.0-5cfdc9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-binding" % "2.1.7-75e589",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-e17e50",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.0-134830",
  "org.scalablytyped" %%% "aurelia-logging" % "1.5.0-e8e53a",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.4-221e61",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.0-0235c2",
  "org.scalablytyped" %%% "aurelia-path" % "1.1.1-24f9ec",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.1-4e94e7",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.1-7f3f3e",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190102Z-bb17db",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        