organization := "org.scalablytyped"
name := "angular__forms"
version := "14.2.8-f8a9e2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-8684db",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.6-92792f",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "14.2.6-1aa4c3",
  "org.scalablytyped" %%% "angular__compiler" % "14.2.8-b9651c",
  "org.scalablytyped" %%% "angular__compiler-cli" % "14.2.7-3054f0",
  "org.scalablytyped" %%% "angular__core" % "14.2.8-aa226d",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20220624Z-043aa4",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-bf895e",
  "org.scalablytyped" %%% "babel__parser" % "7.20.0-6157ab",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-1a1261",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-aa17f1",
  "org.scalablytyped" %%% "babel__types" % "7.20.0-d18d74",
  "org.scalablytyped" %%% "convert-source-map" % "1.5-dt-20211202Z-ed3b05",
  "org.scalablytyped" %%% "dependency-graph" % "0.11.0-efd2dc",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-09f6eb",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-deb100",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "re2" % "1.17.7-7aac79",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-6ed253",
  "org.scalablytyped" %%% "semver" % "7.3-dt-20221026Z-e709b4",
  "org.scalablytyped" %%% "source-map" % "0.7.4-01a3bb",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "typescript" % "4.8.4-60b1be",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
