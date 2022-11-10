organization := "org.scalablytyped"
name := "antv__g-plugin-canvas-renderer"
version := "1.7.20-b79101"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "antv__g-lite" % "1.0.6-3324b0",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-path-generator" % "1.1.17-7554f7",
  "org.scalablytyped" %%% "antv__g-plugin-image-loader" % "1.1.18-5a114a",
  "org.scalablytyped" %%% "antv__util" % "3.3.1-e7bc47",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-3076aa",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-85a0f5",
  "org.scalablytyped" %%% "inversify" % "6.0.1-6db334",
  "org.scalablytyped" %%% "mana-syringe" % "0.3.2-4331b0",
  "org.scalablytyped" %%% "offscreencanvas" % "2019.7-dt-20220526Z-096bcd",
  "org.scalablytyped" %%% "rbush" % "3.0-dt-20220819Z-9c07f9",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
