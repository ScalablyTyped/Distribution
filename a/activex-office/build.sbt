organization := "org.scalablytyped"
name := "activex-office"
version := "16.0-dt-20220705Z-196dee"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20220705Z-b804c3",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20220705Z-6d165f",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
