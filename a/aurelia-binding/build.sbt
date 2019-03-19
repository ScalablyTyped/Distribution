organization := "org.scalablytyped"
name := "aurelia-binding"
version := "2.2.1-e31b58"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-e426ef",
  "org.scalablytyped" %%% "aurelia-logging" % "1.5.1-fe2bf9",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.5-118e23",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.1-ddd1c8",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.2-30affb",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        