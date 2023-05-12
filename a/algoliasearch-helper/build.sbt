organization := "org.scalablytyped"
name := "algoliasearch-helper"
version := "3.13.0-191879"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.17.0-0d6f96",
  "org.scalablytyped" %%% "algolia__client-analytics" % "4.17.0-e6a64a",
  "org.scalablytyped" %%% "algolia__client-common" % "4.17.0-b718f6",
  "org.scalablytyped" %%% "algolia__client-personalization" % "4.17.0-cfa59c",
  "org.scalablytyped" %%% "algolia__client-search" % "4.17.0-62cecd",
  "org.scalablytyped" %%% "algolia__events" % "4.0.1-cc6f58",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.17.0-7cb088",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.17.0-c8f211",
  "org.scalablytyped" %%% "algolia__transporter" % "4.17.0-57f2ce",
  "org.scalablytyped" %%% "algoliasearch" % "4.17.0-332923",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
