organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-413209"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-f779a1",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-fada11",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-e00f34",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-fab591",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20221018Z-83d8b1",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20211202Z-7a41ee",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-d3a37e",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-f2ba2a",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.10-3f430d",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-e43de1",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-08aa87",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
