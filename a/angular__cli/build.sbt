organization := "org.scalablytyped"
name := "angular__cli"
version := "14.2.6-08af84"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-96c572",
  "org.scalablytyped" %%% "angular-devkit__architect" % "0.1402.6-81d625",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.6-5a1f46",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "14.2.6-9bdc0d",
  "org.scalablytyped" %%% "ansi-colors" % "4.1.3-3e5bdd",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-8b3bb1",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20221107Z-ae4035",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-a85b24",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-57a310",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "node-fetch" % "3.3.0-2d1740",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20211202Z-92634e",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20220214Z-e1eccd",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20211223Z-2e7867",
  "org.scalablytyped" %%% "pacote" % "11.1-dt-20220616Z-28c591",
  "org.scalablytyped" %%% "re2" % "1.17.7-41dbc1",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-fec6f6",
  "org.scalablytyped" %%% "source-map" % "0.7.4-14f7e0",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-a8775f",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-91b38e",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-4bb631",
  "org.scalablytyped" %%% "yargs" % "17.0-dt-20221114Z-f77e52",
  "org.scalablytyped" %%% "yargs-parser" % "21.0-dt-20220624Z-8e893f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
