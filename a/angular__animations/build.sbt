organization := "org.scalablytyped"
name := "angular__animations"
version := "15.0.0-0ada94"
scalaVersion := "3.2.2-RC1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-9c7775",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.9-5d0cc1",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "14.2.9-a567ea",
  "org.scalablytyped" %%% "angular__compiler" % "15.0.0-bfe274",
  "org.scalablytyped" %%% "angular__compiler-cli" % "14.2.10-0f5633",
  "org.scalablytyped" %%% "angular__core" % "15.0.0-90f1e3",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20221107Z-bfbaa8",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-a5f5d8",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-88d706",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-4b071b",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-3986dd",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-a7b16d",
  "org.scalablytyped" %%% "convert-source-map" % "1.5-dt-20211202Z-dea40d",
  "org.scalablytyped" %%% "dependency-graph" % "0.11.0-409ead",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-d83cfc",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-8b6df4",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-99df59",
  "org.scalablytyped" %%% "re2" % "1.17.7-090208",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-c0f8c3",
  "org.scalablytyped" %%% "semver" % "7.3-dt-20221026Z-3e7390",
  "org.scalablytyped" %%% "source-map" % "0.7.4-c38b99",
  "org.scalablytyped" %%% "std" % "4.9-448261",
  "org.scalablytyped" %%% "typescript" % "4.9.3-47e610",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-b9117c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
