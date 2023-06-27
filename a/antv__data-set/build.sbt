organization := "org.scalablytyped"
name := "antv__data-set"
version := "0.11.8-147942"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-geo" % "3.0-dt-20221230Z-245c31",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-f1db3d",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2",
  "org.scalablytyped" %%% "wolfy87-eventemitter" % "5.2.9-642a41")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
