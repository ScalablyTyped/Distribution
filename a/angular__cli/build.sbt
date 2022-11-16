organization := "org.scalablytyped"
name := "angular__cli"
version := "14.2.6-cfd9db"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-3b5adf",
  "org.scalablytyped" %%% "angular-devkit__architect" % "0.1402.6-adf0a1",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.6-907acd",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "14.2.6-cb0e83",
  "org.scalablytyped" %%% "ansi-colors" % "4.1.3-9d50d2",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-005ba9",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20221107Z-84bcc0",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-4430b6",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-240be7",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "node-fetch" % "3.3.0-520780",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20211202Z-92634e",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20220214Z-560763",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20211223Z-345552",
  "org.scalablytyped" %%% "pacote" % "11.1-dt-20220616Z-b02056",
  "org.scalablytyped" %%% "re2" % "1.17.7-7b689a",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-2ac93e",
  "org.scalablytyped" %%% "source-map" % "0.7.4-c99616",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-a895b3",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-48adf0",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-9ebd39",
  "org.scalablytyped" %%% "yargs" % "17.0-dt-20221114Z-968869",
  "org.scalablytyped" %%% "yargs-parser" % "21.0-dt-20220624Z-42d3da")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
