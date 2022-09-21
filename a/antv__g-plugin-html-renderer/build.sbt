organization := "org.scalablytyped"
name := "antv__g-plugin-html-renderer"
version := "1.7.17-f542ae"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "antv__g-lite" % "1.0.6-dd544e",
  "org.scalablytyped" %%% "antv__util" % "3.3.0-1dd8f6",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-9853ae",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-b3347b",
  "org.scalablytyped" %%% "inversify" % "6.0.1-ae6f59",
  "org.scalablytyped" %%% "mana-syringe" % "0.3.2-c86092",
  "org.scalablytyped" %%% "offscreencanvas" % "2019.7-dt-20220526Z-457f7e",
  "org.scalablytyped" %%% "rbush" % "3.0-dt-20220819Z-551f31",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
