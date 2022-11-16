organization := "org.scalablytyped"
name := "algoliasearch-helper"
version := "3.11.1-2af3ab"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.14.2-6fb5c4",
  "org.scalablytyped" %%% "algolia__client-analytics" % "4.14.2-117dd2",
  "org.scalablytyped" %%% "algolia__client-common" % "4.14.2-befd11",
  "org.scalablytyped" %%% "algolia__client-personalization" % "4.14.2-dfc89a",
  "org.scalablytyped" %%% "algolia__client-search" % "4.14.2-591501",
  "org.scalablytyped" %%% "algolia__events" % "4.0.1-7dd306",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.14.2-accbf5",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.14.2-cfec5f",
  "org.scalablytyped" %%% "algolia__transporter" % "4.14.2-ff0528",
  "org.scalablytyped" %%% "algoliasearch" % "4.14.2-2345db",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
