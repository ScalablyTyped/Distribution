organization := "org.scalablytyped"
name := "antv__g-canvas"
version := "1.9.5-2bcfc3"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "antv__g-lite" % "1.0.6-8295fa",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-path-generator" % "1.1.17-9782a1",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-picker" % "1.8.14-424a0a",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-renderer" % "1.7.20-3413bc",
  "org.scalablytyped" %%% "antv__g-plugin-dom-interaction" % "1.7.17-9d8bba",
  "org.scalablytyped" %%% "antv__g-plugin-html-renderer" % "1.7.17-58602e",
  "org.scalablytyped" %%% "antv__g-plugin-image-loader" % "1.1.18-545de9",
  "org.scalablytyped" %%% "antv__util" % "3.3.2-3dfb65",
  "org.scalablytyped" %%% "eventemitter3" % "5.0.1-284739",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-2ad910",
  "org.scalablytyped" %%% "inversify" % "6.0.1-fa8494",
  "org.scalablytyped" %%% "mana-syringe" % "0.3.2-9664a1",
  "org.scalablytyped" %%% "rbush" % "3.0-dt-20221230Z-80f9bf",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
