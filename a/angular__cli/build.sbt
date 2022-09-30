organization := "org.scalablytyped"
name := "angular__cli"
version := "14.2.3-b9eaeb"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-7e3772",
  "org.scalablytyped" %%% "angular-devkit__architect" % "0.1402.3-ec9aec",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.3-63fde9",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "14.2.3-b98780",
  "org.scalablytyped" %%% "ansi-colors" % "4.1.3-e21828",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-bbb0dd",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20220928Z-52b1ed",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-1cea99",
  "org.scalablytyped" %%% "magic-string" % "0.26.4-0cfc9f",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "node-fetch" % "3.2.10-8eede4",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20211202Z-c872f9",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20220214Z-8d5b16",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20211223Z-99979d",
  "org.scalablytyped" %%% "pacote" % "11.1-dt-20220616Z-cfae75",
  "org.scalablytyped" %%% "re2" % "1.17.7-80a78e",
  "org.scalablytyped" %%% "source-map" % "0.7.4-09b2a8",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-e8d31c",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-bafe80",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-6052b3",
  "org.scalablytyped" %%% "yargs" % "17.0-dt-20220923Z-d54430",
  "org.scalablytyped" %%% "yargs-parser" % "21.0-dt-20220624Z-8dd397")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
