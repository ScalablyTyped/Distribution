organization := "org.scalablytyped"
name := "angular__cli"
version := "16.0.1-c9b41e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.12.0-aebde1",
  "org.scalablytyped" %%% "angular-devkit__architect" % "0.1600.1-3968f6",
  "org.scalablytyped" %%% "angular-devkit__core" % "16.0.1-32d515",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "16.0.1-50c205",
  "org.scalablytyped" %%% "ansi-colors" % "4.1.3-7680c8",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-534907",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20230308Z-1fef70",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-59c48d",
  "org.scalablytyped" %%% "magic-string" % "0.30.0-c7f539",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "node-fetch" % "3.3.1-0dca8e",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20211202Z-edb2bc",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20220214Z-a8a5a6",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20211223Z-812e7c",
  "org.scalablytyped" %%% "pacote" % "11.1-dt-20220616Z-e4b50d",
  "org.scalablytyped" %%% "re2" % "1.18.0-6019fb",
  "org.scalablytyped" %%% "rxjs" % "7.8.1-1301bf",
  "org.scalablytyped" %%% "source-map" % "0.7.4-e1e422",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-8aea55",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-176e7e",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-347272")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
