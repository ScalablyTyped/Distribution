organization := "org.scalablytyped"
name := "algolia__client-analytics"
version := "4.14.2-a8ccac"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.14.2-b67f9d",
  "org.scalablytyped" %%% "algolia__client-common" % "4.14.2-31d18c",
  "org.scalablytyped" %%% "algolia__client-search" % "4.14.2-a6b000",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.14.2-2e8dad",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.14.2-cb80f2",
  "org.scalablytyped" %%% "algolia__transporter" % "4.14.2-e2ee64",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
