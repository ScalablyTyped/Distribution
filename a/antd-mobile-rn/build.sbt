organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-07c78e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-7b6cf2",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-737217",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-227c4e",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220913Z-bad9e4",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20220921Z-644601",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20211202Z-5ba350",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-a95aa2",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-75423e",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.10-4764c4",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-d7a1bf",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fce63f",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
