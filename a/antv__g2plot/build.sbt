organization := "org.scalablytyped"
name := "antv__g2plot"
version := "2.4.20-31cf8e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "antv__adjust" % "0.2.5-75a3a7",
  "org.scalablytyped" %%% "antv__attr" % "0.3.3-809483",
  "org.scalablytyped" %%% "antv__component" % "0.8.32-68bf7c",
  "org.scalablytyped" %%% "antv__coord" % "0.4.4-872d3e",
  "org.scalablytyped" %%% "antv__event-emitter" % "0.1.3-5e8d71",
  "org.scalablytyped" %%% "antv__g-base" % "0.5.11-70abd9",
  "org.scalablytyped" %%% "antv__g2" % "4.2.8-25c699",
  "org.scalablytyped" %%% "csstype" % "3.1.1-0912f8",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-0f32a8",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-0d1815",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
