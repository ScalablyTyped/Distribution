organization := "org.scalablytyped"
name := "aframe"
version := "1.2-dt-20220503Z-ab509a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "animejs" % "3.1-dt-20221018Z-0d06cf",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "three" % "0.146-dt-20221106Z-d874fd",
  "org.scalablytyped" %%% "webxr" % "0.5-dt-20220721Z-07f759")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
