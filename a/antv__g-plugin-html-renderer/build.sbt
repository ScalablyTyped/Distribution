organization := "org.scalablytyped"
name := "antv__g-plugin-html-renderer"
version := "1.7.17-2c5af0"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "antv__g-lite" % "1.0.6-b91685",
  "org.scalablytyped" %%% "antv__util" % "3.3.0-5161dd",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-b75196",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-0d1815",
  "org.scalablytyped" %%% "inversify" % "6.0.1-f39010",
  "org.scalablytyped" %%% "mana-syringe" % "0.3.2-12cfd9",
  "org.scalablytyped" %%% "offscreencanvas" % "2019.7-dt-20220526Z-fdde97",
  "org.scalablytyped" %%% "rbush" % "3.0-dt-20220819Z-49f5af",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
