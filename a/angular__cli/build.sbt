organization := "org.scalablytyped"
name := "angular__cli"
version := "14.2.6-2d72e6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-e03df2",
  "org.scalablytyped" %%% "angular-devkit__architect" % "0.1402.6-3abe59",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.6-555c59",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "14.2.6-3fc27f",
  "org.scalablytyped" %%% "ansi-colors" % "4.1.3-67f56e",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-6ffa19",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20221107Z-52164f",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-18e12a",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-dba250",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "node-fetch" % "3.3.0-2d4a26",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20211202Z-edb2bc",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20220214Z-fca69b",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20211223Z-226472",
  "org.scalablytyped" %%% "pacote" % "11.1-dt-20220616Z-b3e090",
  "org.scalablytyped" %%% "re2" % "1.17.7-31fc73",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-d48537",
  "org.scalablytyped" %%% "source-map" % "0.7.4-0d2ade",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-120378",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-5d5f40",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-8d8221",
  "org.scalablytyped" %%% "yargs" % "17.0-dt-20221114Z-d5e9bc",
  "org.scalablytyped" %%% "yargs-parser" % "21.0-dt-20220624Z-cd65a7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
