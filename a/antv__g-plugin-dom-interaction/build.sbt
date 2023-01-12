organization := "org.scalablytyped"
name := "antv__g-plugin-dom-interaction"
version := "1.7.17-5c786a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "antv__g-lite" % "1.0.6-110f87",
  "org.scalablytyped" %%% "antv__util" % "3.3.1-e33eaa",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-0503e8",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-27ca14",
  "org.scalablytyped" %%% "inversify" % "6.0.1-f71ce0",
  "org.scalablytyped" %%% "mana-syringe" % "0.3.2-dbc3f6",
  "org.scalablytyped" %%% "rbush" % "3.0-dt-20220819Z-3ab3c3",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
