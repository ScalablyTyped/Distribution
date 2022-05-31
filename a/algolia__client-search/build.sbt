organization := "org.scalablytyped"
name := "algolia__client-search"
version := "4.8.0-de94e8"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.8.0-815a1f",
  "org.scalablytyped" %%% "algolia__client-common" % "4.8.0-e7fc4c",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.8.0-1c95d3",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.8.0-228e70",
  "org.scalablytyped" %%% "algolia__transporter" % "4.8.0-339222",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
