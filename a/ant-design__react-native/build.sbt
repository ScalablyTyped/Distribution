organization := "org.scalablytyped"
name := "ant-design__react-native"
version := "4.0.6-9aae48"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-593952",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b8d190",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-a12f9a",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-c80121",
  "org.scalablytyped" %%% "react-native" % "0.63-dt-20201120Z-adb02e",
  "org.scalablytyped" %%% "react-native-collapsible" % "1.5.3-412ae4",
  "org.scalablytyped" %%% "react-native-community__picker" % "1.8.1-ec6ad3",
  "org.scalablytyped" %%% "react-native-community__viewpager" % "4.2.0-c6a2fe",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-a5eed0",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-a541c3",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
