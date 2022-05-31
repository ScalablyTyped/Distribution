organization := "org.scalablytyped"
name := "antv__data-set"
version := "0.11.7-92125b"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-geo" % "2.0-dt-20201002Z-886c89",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20201002Z-2461bc",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "wolfy87-eventemitter" % "5.2.9-8aad1e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
