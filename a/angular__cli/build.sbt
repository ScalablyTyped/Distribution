organization := "org.scalablytyped"
name := "angular__cli"
version := "14.2.6-c439c6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-5adede",
  "org.scalablytyped" %%% "angular-devkit__architect" % "0.1402.6-d74faf",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.6-e3a2c5",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "14.2.6-ec1399",
  "org.scalablytyped" %%% "ansi-colors" % "4.1.3-1bec1a",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-975c5a",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20221107Z-18de73",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-0c8670",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-1fe3cb",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "node-fetch" % "3.2.10-581983",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20211202Z-262b19",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20220214Z-38e932",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20211223Z-7a4bbe",
  "org.scalablytyped" %%% "pacote" % "11.1-dt-20220616Z-7de7cb",
  "org.scalablytyped" %%% "re2" % "1.17.7-349e63",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-9dc6db",
  "org.scalablytyped" %%% "source-map" % "0.7.4-114bc3",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-81c7b7",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-c2d69f",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-af3fab",
  "org.scalablytyped" %%% "yargs" % "17.0-dt-20220923Z-b9c9f1",
  "org.scalablytyped" %%% "yargs-parser" % "21.0-dt-20220624Z-7bac0d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
