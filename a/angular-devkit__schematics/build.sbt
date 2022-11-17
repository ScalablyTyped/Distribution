organization := "org.scalablytyped"
name := "angular-devkit__schematics"
version := "14.2.9-a567ea"
scalaVersion := "3.2.2-RC1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-9c7775",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.9-5d0cc1",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-d83cfc",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-8b6df4",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-99df59",
  "org.scalablytyped" %%% "re2" % "1.17.7-090208",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-c0f8c3",
  "org.scalablytyped" %%% "source-map" % "0.7.4-c38b99",
  "org.scalablytyped" %%% "std" % "4.9-448261",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-b9117c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
