organization := "org.scalablytyped"
name := "antv__g2"
version := "4.2.8-3be824"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "antv__adjust" % "0.2.5-7595af",
  "org.scalablytyped" %%% "antv__attr" % "0.3.3-6f8d69",
  "org.scalablytyped" %%% "antv__component" % "0.8.28-878eee",
  "org.scalablytyped" %%% "antv__coord" % "0.4.4-5fcd03",
  "org.scalablytyped" %%% "antv__event-emitter" % "0.1.3-9befa3",
  "org.scalablytyped" %%% "antv__g-base" % "0.5.11-f863f8",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-0f32a8",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-071b13",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
