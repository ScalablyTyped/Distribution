organization := "org.scalablytyped"
name := "algolia__client-analytics"
version := "4.18.0-6783c9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.18.0-198faa",
  "org.scalablytyped" %%% "algolia__client-common" % "4.18.0-c04920",
  "org.scalablytyped" %%% "algolia__client-search" % "4.18.0-e3e11a",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.18.0-296f0b",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.18.0-d9d1ad",
  "org.scalablytyped" %%% "algolia__transporter" % "4.18.0-a1fea4",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
