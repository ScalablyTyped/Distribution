organization := "org.scalablytyped"
name := "angular__cli"
version := "14.2.3-1ec523"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-6f26a9",
  "org.scalablytyped" %%% "angular-devkit__architect" % "0.1402.3-98ba88",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.3-efd9f2",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "14.2.3-0192e4",
  "org.scalablytyped" %%% "ansi-colors" % "4.1.3-8e5ba0",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-0c5722",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20220928Z-5cd749",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-f8f486",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-bd69f8",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "node-fetch" % "3.2.10-b6784f",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20211202Z-c872f9",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20220214Z-98f5a9",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20211223Z-c17521",
  "org.scalablytyped" %%% "pacote" % "11.1-dt-20220616Z-de8dcf",
  "org.scalablytyped" %%% "re2" % "1.17.7-e9900d",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-0dd117",
  "org.scalablytyped" %%% "source-map" % "0.7.4-942cbd",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-d90594",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-d9ee56",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-d613cd",
  "org.scalablytyped" %%% "yargs" % "17.0-dt-20220923Z-ba1b24",
  "org.scalablytyped" %%% "yargs-parser" % "21.0-dt-20220624Z-c0cd73")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
