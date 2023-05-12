organization := "org.scalablytyped"
name := "antv__g-plugin-image-loader"
version := "1.1.18-5cd5bf"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "antv__g-lite" % "1.0.6-710e87",
  "org.scalablytyped" %%% "antv__util" % "3.3.2-5db7d6",
  "org.scalablytyped" %%% "eventemitter3" % "5.0.1-abf8ed",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-a497a6",
  "org.scalablytyped" %%% "inversify" % "6.0.1-a66d5a",
  "org.scalablytyped" %%% "mana-syringe" % "0.3.2-90da6b",
  "org.scalablytyped" %%% "rbush" % "3.0-dt-20221230Z-6a9e93",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
