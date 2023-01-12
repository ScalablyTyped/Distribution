organization := "org.scalablytyped"
name := "algoliasearch-helper"
version := "3.11.1-1f69ed"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.14.2-0f67b5",
  "org.scalablytyped" %%% "algolia__client-analytics" % "4.14.2-76706a",
  "org.scalablytyped" %%% "algolia__client-common" % "4.14.2-ad6626",
  "org.scalablytyped" %%% "algolia__client-personalization" % "4.14.2-81b1bd",
  "org.scalablytyped" %%% "algolia__client-search" % "4.14.2-e36e98",
  "org.scalablytyped" %%% "algolia__events" % "4.0.1-851563",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.14.2-ca8844",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.14.2-983996",
  "org.scalablytyped" %%% "algolia__transporter" % "4.14.2-3f1e9b",
  "org.scalablytyped" %%% "algoliasearch" % "4.14.2-a3da19",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
