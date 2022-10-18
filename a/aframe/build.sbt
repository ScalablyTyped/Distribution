organization := "org.scalablytyped"
name := "aframe"
version := "1.2-dt-20220503Z-09f75a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "animejs" % "3.1-dt-20220712Z-18bc61",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "three" % "0.144-dt-20220902Z-01e90a",
  "org.scalablytyped" %%% "webxr" % "0.5-dt-20220721Z-cd43ff")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
