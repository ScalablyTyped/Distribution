organization := "org.scalablytyped"
name := "angular__cli"
version := "14.2.6-1e0ff1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-fcbdcb",
  "org.scalablytyped" %%% "angular-devkit__architect" % "0.1402.6-e75f1e",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.6-598faf",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "14.2.6-82a4d7",
  "org.scalablytyped" %%% "ansi-colors" % "4.1.3-b3eb08",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-385072",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20220928Z-898b9b",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-09f6eb",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-deb100",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "node-fetch" % "3.2.10-178c8a",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20211202Z-262b19",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20220214Z-c0fcac",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20211223Z-51157a",
  "org.scalablytyped" %%% "pacote" % "11.1-dt-20220616Z-576ed1",
  "org.scalablytyped" %%% "re2" % "1.17.7-18b669",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-a78fa8",
  "org.scalablytyped" %%% "source-map" % "0.7.4-01a3bb",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-b885cd",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-501e6d",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092",
  "org.scalablytyped" %%% "yargs" % "17.0-dt-20220923Z-f31aee",
  "org.scalablytyped" %%% "yargs-parser" % "21.0-dt-20220624Z-7e97d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
