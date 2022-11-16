organization := "org.scalablytyped"
name := "antv__g-plugin-image-loader"
version := "1.1.18-1c9e38"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "antv__g-lite" % "1.0.6-9325ab",
  "org.scalablytyped" %%% "antv__util" % "3.3.1-73b2ea",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-5bff7d",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-8ec21e",
  "org.scalablytyped" %%% "inversify" % "6.0.1-d4bb21",
  "org.scalablytyped" %%% "mana-syringe" % "0.3.2-b815ac",
  "org.scalablytyped" %%% "rbush" % "3.0-dt-20220819Z-00e49d",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
