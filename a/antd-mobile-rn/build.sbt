organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-a6e519"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-12dd96",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-e64588",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20221018Z-3962e1",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20211202Z-24db48",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-0b07ba",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-4cceea",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.10-396934",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-c4b063",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
