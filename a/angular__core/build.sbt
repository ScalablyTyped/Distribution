organization := "org.scalablytyped"
name := "angular__core"
version := "14.2.7-9d7158"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-e75802",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.6-ab4d33",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "14.2.6-6ec6c4",
  "org.scalablytyped" %%% "angular__compiler" % "14.2.7-1a35e2",
  "org.scalablytyped" %%% "angular__compiler-cli" % "14.2.7-82a076",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20220624Z-580652",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-602e3f",
  "org.scalablytyped" %%% "babel__parser" % "7.19.6-1f26d3",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-c402ef",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-1aedc0",
  "org.scalablytyped" %%% "babel__types" % "7.19.4-ea0dd0",
  "org.scalablytyped" %%% "convert-source-map" % "1.5-dt-20211202Z-ed3b05",
  "org.scalablytyped" %%% "dependency-graph" % "0.11.0-efd2dc",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-09f6eb",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-deb100",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "re2" % "1.17.7-9b0ba5",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-d5e24c",
  "org.scalablytyped" %%% "semver" % "7.3-dt-20220811Z-1db0d4",
  "org.scalablytyped" %%% "source-map" % "0.7.4-01a3bb",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "typescript" % "4.8.4-60b1be",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
