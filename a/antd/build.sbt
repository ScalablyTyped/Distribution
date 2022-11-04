organization := "org.scalablytyped"
name := "antd"
version := "4.24.1-e0ae7b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ant-design__icons" % "4.7.0-d38622",
  "org.scalablytyped" %%% "ant-design__icons-svg" % "4.2.1-58696f",
  "org.scalablytyped" %%% "ant-design__react-slick" % "0.29.2-4f9b25",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "dayjs" % "1.11.6-153a22",
  "org.scalablytyped" %%% "moment" % "2.29.4-dbaff2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "rc-cascader" % "3.7.0-348d11",
  "org.scalablytyped" %%% "rc-component__portal" % "1.0.1-98bbbe",
  "org.scalablytyped" %%% "rc-dialog" % "9.0.2-6c55b0",
  "org.scalablytyped" %%% "rc-drawer" % "6.0.0-69a379",
  "org.scalablytyped" %%% "rc-field-form" % "1.27.3-d4ab56",
  "org.scalablytyped" %%% "rc-image" % "5.9.0-fa9b54",
  "org.scalablytyped" %%% "rc-input" % "0.1.4-55b38f",
  "org.scalablytyped" %%% "rc-input-number" % "7.3.9-6b1bd6",
  "org.scalablytyped" %%% "rc-mentions" % "1.10.0-36ed04",
  "org.scalablytyped" %%% "rc-menu" % "9.7.1-da69c7",
  "org.scalablytyped" %%% "rc-motion" % "2.6.2-206876",
  "org.scalablytyped" %%% "rc-notification" % "4.6.1-9c03f0",
  "org.scalablytyped" %%% "rc-pagination" % "3.1.17-8e793e",
  "org.scalablytyped" %%% "rc-picker" % "3.0.0-4-26ce4b",
  "org.scalablytyped" %%% "rc-rate" % "2.9.2-5ec48b",
  "org.scalablytyped" %%% "rc-segmented" % "2.1.0-07807c",
  "org.scalablytyped" %%% "rc-select" % "14.1.13-a3fe66",
  "org.scalablytyped" %%% "rc-slider" % "10.0.1-da8fb8",
  "org.scalablytyped" %%% "rc-steps" % "6.0.0-alpha.1-bdf1ab",
  "org.scalablytyped" %%% "rc-table" % "7.28.1-6bfdce",
  "org.scalablytyped" %%% "rc-tabs" % "12.2.2-26d686",
  "org.scalablytyped" %%% "rc-textarea" % "0.4.6-aff720",
  "org.scalablytyped" %%% "rc-tooltip" % "5.2.2-87df98",
  "org.scalablytyped" %%% "rc-tree" % "5.7.0-575e23",
  "org.scalablytyped" %%% "rc-tree-select" % "5.5.3-4f2822",
  "org.scalablytyped" %%% "rc-trigger" % "5.3.3-d86c9a",
  "org.scalablytyped" %%% "rc-upload" % "4.3.4-27f280",
  "org.scalablytyped" %%% "rc-util" % "5.24.4-bae706",
  "org.scalablytyped" %%% "rc-virtual-list" % "3.4.8-2cf663",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221027Z-1a0a13",
  "org.scalablytyped" %%% "react-dom" % "18.0-dt-20221027Z-34f203",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "scroll-into-view-if-needed" % "2.2.29-3eddbf",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
