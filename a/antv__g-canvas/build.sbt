organization := "org.scalablytyped"
name := "antv__g-canvas"
version := "1.9.5-a2546e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "antv__g-lite" % "1.0.6-426f9b",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-path-generator" % "1.1.17-824fb5",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-picker" % "1.8.14-fe9ef7",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-renderer" % "1.7.20-12ecf8",
  "org.scalablytyped" %%% "antv__g-plugin-dom-interaction" % "1.7.17-4bfd67",
  "org.scalablytyped" %%% "antv__g-plugin-html-renderer" % "1.7.17-b9b308",
  "org.scalablytyped" %%% "antv__g-plugin-image-loader" % "1.1.18-62a637",
  "org.scalablytyped" %%% "antv__util" % "3.3.0-3c59b5",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-ebb97c",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-071b13",
  "org.scalablytyped" %%% "inversify" % "6.0.1-13e08a",
  "org.scalablytyped" %%% "mana-syringe" % "0.3.2-adeb09",
  "org.scalablytyped" %%% "offscreencanvas" % "2019.7-dt-20220526Z-f25afc",
  "org.scalablytyped" %%% "rbush" % "3.0-dt-20220819Z-b26e7b",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
