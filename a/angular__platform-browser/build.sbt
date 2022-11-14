organization := "org.scalablytyped"
name := "angular__platform-browser"
version := "14.2.10-c253c6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-8ddd54",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.6-debc7c",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "14.2.6-ef164b",
  "org.scalablytyped" %%% "angular__animations" % "14.2.10-9b26b6",
  "org.scalablytyped" %%% "angular__common" % "14.2.10-c4c9a7",
  "org.scalablytyped" %%% "angular__compiler" % "14.2.10-5bb2ee",
  "org.scalablytyped" %%% "angular__compiler-cli" % "14.2.7-b2c607",
  "org.scalablytyped" %%% "angular__core" % "14.2.10-50e0c6",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20221107Z-0a8cda",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-aeb792",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-97fb28",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-0c7c84",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-7d45e9",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-2e222a",
  "org.scalablytyped" %%% "convert-source-map" % "1.5-dt-20211202Z-42912f",
  "org.scalablytyped" %%% "dependency-graph" % "0.11.0-a01018",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-0c8670",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-1fe3cb",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "re2" % "1.17.7-349e63",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-9dc6db",
  "org.scalablytyped" %%% "semver" % "7.3-dt-20221026Z-2fecb8",
  "org.scalablytyped" %%% "source-map" % "0.7.4-114bc3",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "typescript" % "4.8.4-227bad",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-af3fab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
