organization := "org.scalablytyped"
name := "angular__cli"
version := "14.2.3-f7d34b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-025d79",
  "org.scalablytyped" %%% "angular-devkit__architect" % "0.1402.3-6fe1bf",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.3-50f405",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "14.2.3-5a4773",
  "org.scalablytyped" %%% "ansi-colors" % "4.1.3-026783",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-07bd44",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20220815Z-523527",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-14a0e5",
  "org.scalablytyped" %%% "magic-string" % "0.26.3-bbf904",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "node-fetch" % "3.2.10-876ac5",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20211202Z-c872f9",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20220214Z-b6a291",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20211223Z-155663",
  "org.scalablytyped" %%% "pacote" % "11.1-dt-20220616Z-d6040f",
  "org.scalablytyped" %%% "re2" % "1.17.7-22ea4f",
  "org.scalablytyped" %%% "source-map" % "0.7.4-e0c113",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-4bd69e",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-e5e6c8",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-33748e",
  "org.scalablytyped" %%% "yargs" % "17.0-dt-20220829Z-a8b7c8",
  "org.scalablytyped" %%% "yargs-parser" % "21.0-dt-20220624Z-2bf344")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
