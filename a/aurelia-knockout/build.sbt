organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.3.0-4c8159"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-binding" % "2.2.1-e31b58",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-e426ef",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.1-0e94c0",
  "org.scalablytyped" %%% "aurelia-logging" % "1.5.1-fe2bf9",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.5-118e23",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.1-ddd1c8",
  "org.scalablytyped" %%% "aurelia-path" % "1.1.2-fd2b71",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.2-30affb",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.1-ea0da3",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190218Z-402c33",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        