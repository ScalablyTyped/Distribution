organization := "org.scalablytyped"
name := "angular__cli"
version := "14.2.6-68a551"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-8684db",
  "org.scalablytyped" %%% "angular-devkit__architect" % "0.1402.6-b7779f",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.6-92792f",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "14.2.6-1aa4c3",
  "org.scalablytyped" %%% "ansi-colors" % "4.1.3-b3eb08",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-385072",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20220928Z-edeb2b",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-09f6eb",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-deb100",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "node-fetch" % "3.2.10-2f020e",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20211202Z-262b19",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20220214Z-3a237f",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20211223Z-329fa9",
  "org.scalablytyped" %%% "pacote" % "11.1-dt-20220616Z-584364",
  "org.scalablytyped" %%% "re2" % "1.17.7-7aac79",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-6ed253",
  "org.scalablytyped" %%% "source-map" % "0.7.4-01a3bb",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-74a694",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-1db361",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092",
  "org.scalablytyped" %%% "yargs" % "17.0-dt-20220923Z-f31aee",
  "org.scalablytyped" %%% "yargs-parser" % "21.0-dt-20220624Z-7e97d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
