organization := "org.scalablytyped"
name := "antv__data-set"
version := "0.11.8-f66e0c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-geo" % "3.0-dt-20211202Z-084e9a",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-12a811",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "wolfy87-eventemitter" % "5.2.9-29d3cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
