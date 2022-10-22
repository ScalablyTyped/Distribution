organization := "org.scalablytyped"
name := "angular__cli"
version := "14.2.3-8f85a9"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-f4a508",
  "org.scalablytyped" %%% "angular-devkit__architect" % "0.1402.3-116599",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.3-d4bd42",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "14.2.3-60c58f",
  "org.scalablytyped" %%% "ansi-colors" % "4.1.3-8e5ba0",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-0c5722",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20220928Z-50d3d8",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-f8f486",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-bd69f8",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "node-fetch" % "3.2.10-9450e8",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20211202Z-c872f9",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20220214Z-7363ab",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20211223Z-2923c2",
  "org.scalablytyped" %%% "pacote" % "11.1-dt-20220616Z-997457",
  "org.scalablytyped" %%% "re2" % "1.17.7-9752ba",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-22ee0d",
  "org.scalablytyped" %%% "source-map" % "0.7.4-942cbd",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-8991bd",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-acbdfc",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-d613cd",
  "org.scalablytyped" %%% "yargs" % "17.0-dt-20220923Z-ba1b24",
  "org.scalablytyped" %%% "yargs-parser" % "21.0-dt-20220624Z-c0cd73")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
