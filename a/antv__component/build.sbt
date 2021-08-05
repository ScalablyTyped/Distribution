organization := "org.scalablytyped"
name := "antv__component"
version := "0.8.2-e44352"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "antv__event-emitter" % "0.1.2-737552",
  "org.scalablytyped" %%% "antv__g-base" % "0.5.1-35b3db",
  "org.scalablytyped" %%% "d3-timer" % "2.0-dt-20201002Z-12514b",
  "org.scalablytyped" %%% "gl-matrix" % "3.3.0-b4589f",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
