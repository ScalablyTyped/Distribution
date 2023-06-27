organization := "org.scalablytyped"
name := "antv__g-plugin-dom-interaction"
version := "1.7.17-9d8bba"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "antv__g-lite" % "1.0.6-8295fa",
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
