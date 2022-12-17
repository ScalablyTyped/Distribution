organization := "org.scalablytyped"
name := "antv__g2"
version := "4.2.8-60bb8f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "antv__adjust" % "0.2.5-317189",
  "org.scalablytyped" %%% "antv__attr" % "0.3.3-fff6fb",
  "org.scalablytyped" %%% "antv__component" % "0.8.28-719aec",
  "org.scalablytyped" %%% "antv__coord" % "0.4.4-7ba1b3",
  "org.scalablytyped" %%% "antv__event-emitter" % "0.1.3-cc7947",
  "org.scalablytyped" %%% "antv__g-base" % "0.5.11-25ae1b",
  "org.scalablytyped" %%% "csstype" % "3.1.1-4db30e",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-7b4003",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-8dc8db",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
