organization := "org.scalablytyped"
name := "ant-design__react-native"
version := "5.0.2-d98c99"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-4db30e",
  "org.scalablytyped" %%% "hammerjs" % "2.0.8-dt-20220819Z-d2f071",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-8a1cd9",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-cf549b",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20221018Z-e43cee",
  "org.scalablytyped" %%% "react-native-collapsible" % "1.6.0-ddd5c3",
  "org.scalablytyped" %%% "react-native-gesture-handler" % "2.8.0-3fa2d7",
  "org.scalablytyped" %%% "react-native-modal-popover" % "2.1.0-5d2d20",
  "org.scalablytyped" %%% "react-native-picker__picker" % "2.4.7-287d09",
  "org.scalablytyped" %%% "react-test-renderer" % "18.0-dt-20220805Z-9a7cb3",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-6206c7",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
