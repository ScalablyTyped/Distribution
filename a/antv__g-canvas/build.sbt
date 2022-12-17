organization := "org.scalablytyped"
name := "antv__g-canvas"
version := "1.9.5-69d873"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "antv__g-lite" % "1.0.6-60f05e",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-path-generator" % "1.1.17-45043f",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-picker" % "1.8.14-ac0236",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-renderer" % "1.7.20-2a72f9",
  "org.scalablytyped" %%% "antv__g-plugin-dom-interaction" % "1.7.17-e3fb41",
  "org.scalablytyped" %%% "antv__g-plugin-html-renderer" % "1.7.17-8a05d3",
  "org.scalablytyped" %%% "antv__g-plugin-image-loader" % "1.1.18-85e220",
  "org.scalablytyped" %%% "antv__util" % "3.3.1-e481a4",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-5fc355",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-8dc8db",
  "org.scalablytyped" %%% "inversify" % "6.0.1-d97ef7",
  "org.scalablytyped" %%% "mana-syringe" % "0.3.2-9d09ea",
  "org.scalablytyped" %%% "rbush" % "3.0-dt-20220819Z-9fd147",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
