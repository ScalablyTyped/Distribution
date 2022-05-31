organization := "org.scalablytyped"
name := "ant-design__react-native"
version := "4.0.6-7b19d9"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-6a9fe1",
  "org.scalablytyped" %%% "csstype" % "2.6.14-dc2f99",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-3fbed9",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-4ff700",
  "org.scalablytyped" %%% "react-native" % "0.63-dt-20201120Z-0cfe87",
  "org.scalablytyped" %%% "react-native-collapsible" % "1.5.3-28f0da",
  "org.scalablytyped" %%% "react-native-community__picker" % "1.8.1-7bb36d",
  "org.scalablytyped" %%% "react-native-community__viewpager" % "4.2.0-1ccc08",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-e0a228",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-4e6370",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
