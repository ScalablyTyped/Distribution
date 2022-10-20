organization := "org.scalablytyped"
name := "angular__cli"
version := "14.2.3-43bbff"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-cccf4d",
  "org.scalablytyped" %%% "angular-devkit__architect" % "0.1402.3-296ac6",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.3-8be638",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "14.2.3-b08282",
  "org.scalablytyped" %%% "ansi-colors" % "4.1.3-8e5ba0",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-0c5722",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20220928Z-ef950f",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-f8f486",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-bd69f8",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "node-fetch" % "3.2.10-a51f9b",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20211202Z-c872f9",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20220214Z-e20a7c",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20211223Z-82e452",
  "org.scalablytyped" %%% "pacote" % "11.1-dt-20220616Z-41c867",
  "org.scalablytyped" %%% "re2" % "1.17.7-fadabd",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-02ab95",
  "org.scalablytyped" %%% "source-map" % "0.7.4-942cbd",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-5bafe8",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-2de03d",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-d613cd",
  "org.scalablytyped" %%% "yargs" % "17.0-dt-20220923Z-ba1b24",
  "org.scalablytyped" %%% "yargs-parser" % "21.0-dt-20220624Z-c0cd73")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
