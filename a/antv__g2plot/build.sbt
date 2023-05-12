organization := "org.scalablytyped"
name := "antv__g2plot"
version := "2.4.20-4919f1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "antv__adjust" % "0.2.5-d58394",
  "org.scalablytyped" %%% "antv__attr" % "0.3.5-896471",
  "org.scalablytyped" %%% "antv__component" % "0.8.34-1b5e0f",
  "org.scalablytyped" %%% "antv__coord" % "0.4.4-7b2315",
  "org.scalablytyped" %%% "antv__event-emitter" % "0.1.3-f65ae5",
  "org.scalablytyped" %%% "antv__g-base" % "0.5.15-4c86aa",
  "org.scalablytyped" %%% "antv__g2" % "4.2.8-fa139b",
  "org.scalablytyped" %%% "csstype" % "3.1.2-5927f3",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-7b4003",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-a497a6",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
