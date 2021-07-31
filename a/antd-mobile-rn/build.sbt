organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-95ef12"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b8d190",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-a12f9a",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-b22661",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-c80121",
  "org.scalablytyped" %%% "react-native" % "0.63-dt-20201120Z-adb02e",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20200515Z-4fe159",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-999a0b",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-0427b6",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.10-bd0912",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-9aff7f",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
