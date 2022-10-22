organization := "org.scalablytyped"
name := "angular__platform-browser-dynamic"
version := "14.2.7-64a0c6"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-f4a508",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.3-d4bd42",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "14.2.3-60c58f",
  "org.scalablytyped" %%% "angular__animations" % "14.2.7-27d748",
  "org.scalablytyped" %%% "angular__common" % "14.2.7-abe166",
  "org.scalablytyped" %%% "angular__compiler" % "14.2.7-4f45f7",
  "org.scalablytyped" %%% "angular__compiler-cli" % "14.2.2-aafa6f",
  "org.scalablytyped" %%% "angular__core" % "14.2.7-7cd508",
  "org.scalablytyped" %%% "angular__platform-browser" % "14.2.7-4e9904",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20220624Z-317949",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-27b6b7",
  "org.scalablytyped" %%% "babel__parser" % "7.19.6-e8951f",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-f33532",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-0e2ba7",
  "org.scalablytyped" %%% "babel__types" % "7.19.4-1978dd",
  "org.scalablytyped" %%% "convert-source-map" % "1.5-dt-20211202Z-1bfc7c",
  "org.scalablytyped" %%% "dependency-graph" % "0.11.0-d90de9",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-f8f486",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-bd69f8",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "re2" % "1.17.7-9752ba",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-22ee0d",
  "org.scalablytyped" %%% "semver" % "7.3-dt-20220811Z-4e87db",
  "org.scalablytyped" %%% "source-map" % "0.7.4-942cbd",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "typescript" % "4.8.4-676e37",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-d613cd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
