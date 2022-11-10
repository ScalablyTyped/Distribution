organization := "org.scalablytyped"
name := "algoliasearch-helper"
version := "3.11.1-533ba7"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.14.2-3c2a47",
  "org.scalablytyped" %%% "algolia__client-analytics" % "4.14.2-33974a",
  "org.scalablytyped" %%% "algolia__client-common" % "4.14.2-304cae",
  "org.scalablytyped" %%% "algolia__client-personalization" % "4.14.2-516858",
  "org.scalablytyped" %%% "algolia__client-search" % "4.14.2-573aaf",
  "org.scalablytyped" %%% "algolia__events" % "4.0.1-fd66a9",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.14.2-9f1877",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.14.2-ae3e49",
  "org.scalablytyped" %%% "algolia__transporter" % "4.14.2-985fcd",
  "org.scalablytyped" %%% "algoliasearch" % "4.14.2-6b9ce9",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
