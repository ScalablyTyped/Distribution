organization := "org.scalablytyped"
name := "ant-design__react-native"
version := "4.0.6-02eee8"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-f9d962",
  "org.scalablytyped" %%% "csstype" % "2.6.14-344a29",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-49dd4c",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-76d083",
  "org.scalablytyped" %%% "react-native" % "0.63-dt-20201120Z-45fb28",
  "org.scalablytyped" %%% "react-native-collapsible" % "1.5.3-ada38c",
  "org.scalablytyped" %%% "react-native-community__picker" % "1.8.1-334516",
  "org.scalablytyped" %%% "react-native-community__viewpager" % "4.2.0-8ac5c6",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-5c794e",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-fcf7f0",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
