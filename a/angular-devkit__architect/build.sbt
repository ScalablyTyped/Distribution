organization := "org.scalablytyped"
name := "angular-devkit__architect"
version := "0.1402.3-116599"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-f4a508",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.3-d4bd42",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-f8f486",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "re2" % "1.17.7-9752ba",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-22ee0d",
  "org.scalablytyped" %%% "source-map" % "0.7.4-942cbd",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-d613cd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
