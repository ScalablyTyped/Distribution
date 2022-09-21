organization := "org.scalablytyped"
name := "angular__animations"
version := "14.2.3-dfd6b6"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-025d79",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.3-50f405",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "14.2.3-5a4773",
  "org.scalablytyped" %%% "angular__compiler" % "14.2.3-93f2db",
  "org.scalablytyped" %%% "angular__compiler-cli" % "14.2.2-65ac56",
  "org.scalablytyped" %%% "angular__core" % "14.2.3-146fd1",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20220624Z-19cf66",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-558232",
  "org.scalablytyped" %%% "babel__parser" % "7.19.1-0f60fc",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-9d5df8",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220829Z-db75bf",
  "org.scalablytyped" %%% "babel__types" % "7.19.0-70b8c8",
  "org.scalablytyped" %%% "convert-source-map" % "1.5-dt-20211202Z-8fc22a",
  "org.scalablytyped" %%% "dependency-graph" % "0.11.0-98df15",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-14a0e5",
  "org.scalablytyped" %%% "magic-string" % "0.26.3-bbf904",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "re2" % "1.17.7-22ea4f",
  "org.scalablytyped" %%% "semver" % "7.3-dt-20220811Z-e2cc8b",
  "org.scalablytyped" %%% "source-map" % "0.7.4-e0c113",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "typescript" % "4.8.3-775b25",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-33748e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
