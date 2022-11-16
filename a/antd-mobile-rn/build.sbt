organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-7ebd61"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-ab3df7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-53873f",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-2c9aeb",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-9ff1b2",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20221018Z-041ba4",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20211202Z-78e149",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-43cfc1",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-2a9c89",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.10-d02017",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-685822",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-ea4558",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
