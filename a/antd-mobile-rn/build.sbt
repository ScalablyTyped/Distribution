organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-20273c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9b270c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-9c1d48",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-7ff004",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-c1aa2f",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20221018Z-27f111",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20211202Z-c7b1c2",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-0f4a17",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-6a0676",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.10-dec8a7",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-48f371",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fd69ea",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
