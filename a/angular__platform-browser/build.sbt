organization := "org.scalablytyped"
name := "angular__platform-browser"
version := "14.2.10-dbdd2b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-e03df2",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.6-555c59",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "14.2.6-3fc27f",
  "org.scalablytyped" %%% "angular__animations" % "14.2.10-4773fc",
  "org.scalablytyped" %%% "angular__common" % "14.2.10-951f05",
  "org.scalablytyped" %%% "angular__compiler" % "14.2.10-9da090",
  "org.scalablytyped" %%% "angular__compiler-cli" % "14.2.7-10ac45",
  "org.scalablytyped" %%% "angular__core" % "14.2.10-a1f126",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20221107Z-5b3929",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-5fc152",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-0ceec3",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-10b9d5",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-b27c06",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-0db274",
  "org.scalablytyped" %%% "convert-source-map" % "1.5-dt-20211202Z-0de974",
  "org.scalablytyped" %%% "dependency-graph" % "0.11.0-edf6e0",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-18e12a",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-dba250",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "re2" % "1.17.7-31fc73",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-d48537",
  "org.scalablytyped" %%% "semver" % "7.3-dt-20221026Z-7e28ad",
  "org.scalablytyped" %%% "source-map" % "0.7.4-0d2ade",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "typescript" % "4.9.3-94f598",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-8d8221")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
