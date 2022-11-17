organization := "org.scalablytyped"
name := "antd"
version := "4.24.2-0db922"
scalaVersion := "3.2.2-RC1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ant-design__icons" % "4.8.0-2eaf1a",
  "org.scalablytyped" %%% "ant-design__icons-svg" % "4.2.1-a32040",
  "org.scalablytyped" %%% "ant-design__react-slick" % "0.29.2-7bb1b5",
  "org.scalablytyped" %%% "csstype" % "3.1.1-b003b4",
  "org.scalablytyped" %%% "dayjs" % "1.11.6-e1cc84",
  "org.scalablytyped" %%% "moment" % "2.29.4-d9a78e",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-99df59",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-ddcd58",
  "org.scalablytyped" %%% "rc-cascader" % "3.7.0-9f6f89",
  "org.scalablytyped" %%% "rc-component__portal" % "1.0.3-e6b72c",
  "org.scalablytyped" %%% "rc-dialog" % "9.0.2-18f26c",
  "org.scalablytyped" %%% "rc-drawer" % "6.0.1-9feed5",
  "org.scalablytyped" %%% "rc-field-form" % "1.27.3-496dfe",
  "org.scalablytyped" %%% "rc-image" % "5.12.0-6237c4",
  "org.scalablytyped" %%% "rc-input" % "0.1.4-f87565",
  "org.scalablytyped" %%% "rc-input-number" % "7.3.11-7d752e",
  "org.scalablytyped" %%% "rc-mentions" % "1.11.0-d3a147",
  "org.scalablytyped" %%% "rc-menu" % "9.7.2-41af1b",
  "org.scalablytyped" %%% "rc-motion" % "2.6.2-62a362",
  "org.scalablytyped" %%% "rc-notification" % "4.6.1-742985",
  "org.scalablytyped" %%% "rc-pagination" % "3.2.0-7517ec",
  "org.scalablytyped" %%% "rc-picker" % "2.7.0-166bb9",
  "org.scalablytyped" %%% "rc-rate" % "2.9.2-7c8c31",
  "org.scalablytyped" %%% "rc-segmented" % "2.1.0-1b35be",
  "org.scalablytyped" %%% "rc-select" % "14.1.13-8ab852",
  "org.scalablytyped" %%% "rc-slider" % "10.1.0-9f4594",
  "org.scalablytyped" %%% "rc-steps" % "6.0.0-alpha.2-2a601f",
  "org.scalablytyped" %%% "rc-table" % "7.28.1-2f8b75",
  "org.scalablytyped" %%% "rc-tabs" % "12.3.0-ade279",
  "org.scalablytyped" %%% "rc-textarea" % "0.4.6-b0c8dc",
  "org.scalablytyped" %%% "rc-tooltip" % "5.2.2-508ee2",
  "org.scalablytyped" %%% "rc-tree" % "5.7.0-c4f261",
  "org.scalablytyped" %%% "rc-tree-select" % "5.5.4-08f59c",
  "org.scalablytyped" %%% "rc-trigger" % "5.3.3-ca62dd",
  "org.scalablytyped" %%% "rc-upload" % "4.3.4-e286fc",
  "org.scalablytyped" %%% "rc-util" % "5.24.4-75b71b",
  "org.scalablytyped" %%% "rc-virtual-list" % "3.4.8-831180",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-0ec907",
  "org.scalablytyped" %%% "react-dom" % "18.0-dt-20221114Z-fdab72",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-864a4c",
  "org.scalablytyped" %%% "scroll-into-view-if-needed" % "2.2.29-f420a3",
  "org.scalablytyped" %%% "std" % "4.9-448261")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
