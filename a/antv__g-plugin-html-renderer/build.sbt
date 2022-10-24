organization := "org.scalablytyped"
name := "antv__g-plugin-html-renderer"
version := "1.7.17-378d13"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "antv__g-lite" % "1.0.6-408962",
  "org.scalablytyped" %%% "antv__util" % "3.3.0-3dd382",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-30a4f9",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-9a54c5",
  "org.scalablytyped" %%% "inversify" % "6.0.1-60a540",
  "org.scalablytyped" %%% "mana-syringe" % "0.3.2-9a1d0d",
  "org.scalablytyped" %%% "offscreencanvas" % "2019.7-dt-20220526Z-6cf76a",
  "org.scalablytyped" %%% "rbush" % "3.0-dt-20220819Z-334310",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
