organization := "org.scalablytyped"
name := "algolia__transporter"
version := "4.14.2-d2cf2c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.14.2-e8f529",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.14.2-c9aa2c",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.14.2-37f229",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
