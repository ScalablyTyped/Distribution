organization := "org.scalablytyped"
name := "algolia__transporter"
version := "4.14.2-985fcd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.14.2-3c2a47",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.14.2-9f1877",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.14.2-ae3e49",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
