organization := "org.scalablytyped"
name := "antv__component"
version := "0.8.2-c76f51"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "antv__event-emitter" % "0.1.2-1378dc",
  "org.scalablytyped" %%% "antv__g-base" % "0.5.1-7ba8a8",
  "org.scalablytyped" %%% "d3-timer" % "2.0-dt-20201002Z-f43798",
  "org.scalablytyped" %%% "gl-matrix" % "3.3.0-2e2650",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
