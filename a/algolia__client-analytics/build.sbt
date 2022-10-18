organization := "org.scalablytyped"
name := "algolia__client-analytics"
version := "4.14.2-4bd86a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.14.2-36e821",
  "org.scalablytyped" %%% "algolia__client-common" % "4.14.2-23d76d",
  "org.scalablytyped" %%% "algolia__client-search" % "4.14.2-81afdb",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.14.2-b2099b",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.14.2-cdbcfa",
  "org.scalablytyped" %%% "algolia__transporter" % "4.14.2-adaf1e",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
