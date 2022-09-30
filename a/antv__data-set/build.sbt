organization := "org.scalablytyped"
name := "antv__data-set"
version := "0.11.8-5d10c5"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-geo" % "3.0-dt-20211202Z-68870c",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-fa1356",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "wolfy87-eventemitter" % "5.2.9-c30f31")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
