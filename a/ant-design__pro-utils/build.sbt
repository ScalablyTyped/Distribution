organization := "org.scalablytyped"
name := "ant-design__pro-utils"
version := "1.2.0-bb531a"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ant-design__icons" % "4.3.0-1c3115",
  "org.scalablytyped" %%% "ant-design__icons-svg" % "4.1.0-5db55a",
  "org.scalablytyped" %%% "ant-design__react-slick" % "0.27.14-05f06a",
  "org.scalablytyped" %%% "antd" % "4.8.5-da6d6a",
  "org.scalablytyped" %%% "csstype" % "2.6.14-dc2f99",
  "org.scalablytyped" %%% "dayjs" % "1.9.6-37be3d",
  "org.scalablytyped" %%% "moment" % "2.29.1-4a676b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-3fbed9",
  "org.scalablytyped" %%% "rc-dialog" % "8.4.3-a48757",
  "org.scalablytyped" %%% "rc-field-form" % "1.17.2-c1de36",
  "org.scalablytyped" %%% "rc-image" % "4.0.1-e6aa87",
  "org.scalablytyped" %%% "rc-mentions" % "1.5.2-35bbc8",
  "org.scalablytyped" %%% "rc-menu" % "8.10.0-3606d5",
  "org.scalablytyped" %%% "rc-motion" % "2.4.1-19ee81",
  "org.scalablytyped" %%% "rc-notification" % "4.5.4-d46062",
  "org.scalablytyped" %%% "rc-picker" % "2.4.1-ed46dd",
  "org.scalablytyped" %%% "rc-select" % "11.4.2-f056b3",
  "org.scalablytyped" %%% "rc-table" % "7.11.2-c58999",
  "org.scalablytyped" %%% "rc-tabs" % "11.7.1-99bfef",
  "org.scalablytyped" %%% "rc-textarea" % "0.3.1-f8cfb7",
  "org.scalablytyped" %%% "rc-tooltip" % "5.0.1-0eb227",
  "org.scalablytyped" %%% "rc-tree" % "3.11.0-d2ac54",
  "org.scalablytyped" %%% "rc-tree-select" % "4.1.3-d7839b",
  "org.scalablytyped" %%% "rc-trigger" % "5.1.2-fc76ca",
  "org.scalablytyped" %%% "rc-util" % "5.5.0-b053d5",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-4ff700",
  "org.scalablytyped" %%% "scroll-into-view-if-needed" % "2.2.26-8e9e86",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
