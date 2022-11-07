organization := "org.scalablytyped"
name := "aframe"
version := "1.2-dt-20220503Z-b07cbc"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "animejs" % "3.1-dt-20221018Z-a97bcc",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "three" % "0.146-dt-20221106Z-a88ac4",
  "org.scalablytyped" %%% "webxr" % "0.5-dt-20220721Z-ef4a6b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
