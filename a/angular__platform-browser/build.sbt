organization := "org.scalablytyped"
name := "angular__platform-browser"
version := "14.2.10-39a09f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-3b5adf",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.6-907acd",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "14.2.6-cb0e83",
  "org.scalablytyped" %%% "angular__animations" % "14.2.10-44be32",
  "org.scalablytyped" %%% "angular__common" % "14.2.10-19e6e5",
  "org.scalablytyped" %%% "angular__compiler" % "14.2.10-0d3c41",
  "org.scalablytyped" %%% "angular__compiler-cli" % "14.2.7-5452a5",
  "org.scalablytyped" %%% "angular__core" % "14.2.10-2cfec3",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20221107Z-61b7b8",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-42cbbf",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-c798fc",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-3669d2",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-b1d659",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-8b54ca",
  "org.scalablytyped" %%% "convert-source-map" % "1.5-dt-20211202Z-192e06",
  "org.scalablytyped" %%% "dependency-graph" % "0.11.0-e152f4",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-4430b6",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-240be7",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "re2" % "1.17.7-7b689a",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-2ac93e",
  "org.scalablytyped" %%% "semver" % "7.3-dt-20221026Z-8bcab9",
  "org.scalablytyped" %%% "source-map" % "0.7.4-c99616",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "typescript" % "4.9.3-1dab2c",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-9ebd39")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
