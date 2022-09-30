organization := "org.scalablytyped"
name := "algolia__client-search"
version := "4.14.2-b4ebe7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.14.2-3533db",
  "org.scalablytyped" %%% "algolia__client-common" % "4.14.2-f7713f",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.14.2-135c88",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.14.2-1eaa5b",
  "org.scalablytyped" %%% "algolia__transporter" % "4.14.2-908ae3",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
