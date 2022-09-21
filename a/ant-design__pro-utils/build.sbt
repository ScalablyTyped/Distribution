organization := "org.scalablytyped"
name := "ant-design__pro-utils"
version := "2.2.0-855780"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ant-design__cssinjs" % "0.0.0-alpha.52-2a43c5",
  "org.scalablytyped" %%% "ant-design__icons" % "4.7.0-bb6fae",
  "org.scalablytyped" %%% "ant-design__icons-svg" % "4.2.1-331260",
  "org.scalablytyped" %%% "ant-design__pro-provider" % "2.0.3-1f01f2",
  "org.scalablytyped" %%% "ant-design__react-slick" % "0.29.2-67720f",
  "org.scalablytyped" %%% "antd" % "4.23.2-56af6a",
  "org.scalablytyped" %%% "csstype" % "3.1.1-7b6cf2",
  "org.scalablytyped" %%% "dayjs" % "1.11.5-7d2628",
  "org.scalablytyped" %%% "memoize-one" % "6.0.0-10b05c",
  "org.scalablytyped" %%% "moment" % "2.29.4-af05ac",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-737217",
  "org.scalablytyped" %%% "rc-cascader" % "3.7.0-24cb1d",
  "org.scalablytyped" %%% "rc-dialog" % "8.9.0-4a43d6",
  "org.scalablytyped" %%% "rc-drawer" % "5.1.0-d299be",
  "org.scalablytyped" %%% "rc-field-form" % "1.27.1-13377f",
  "org.scalablytyped" %%% "rc-image" % "5.8.0-524260",
  "org.scalablytyped" %%% "rc-input" % "0.1.2-691c09",
  "org.scalablytyped" %%% "rc-input-number" % "7.3.9-737fa7",
  "org.scalablytyped" %%% "rc-mentions" % "1.9.2-72664b",
  "org.scalablytyped" %%% "rc-menu" % "9.6.4-0d11b7",
  "org.scalablytyped" %%% "rc-motion" % "2.6.2-9bbc67",
  "org.scalablytyped" %%% "rc-pagination" % "3.1.17-54f760",
  "org.scalablytyped" %%% "rc-picker" % "2.6.10-05bd05",
  "org.scalablytyped" %%% "rc-rate" % "2.9.2-e80932",
  "org.scalablytyped" %%% "rc-segmented" % "2.1.0-0b6544",
  "org.scalablytyped" %%% "rc-select" % "14.1.13-0175ee",
  "org.scalablytyped" %%% "rc-slider" % "10.0.1-fe9790",
  "org.scalablytyped" %%% "rc-steps" % "5.0.0-alpha.0-0c60f7",
  "org.scalablytyped" %%% "rc-table" % "7.27.2-cd6ed1",
  "org.scalablytyped" %%% "rc-tabs" % "12.1.0-alpha.1-3d177a",
  "org.scalablytyped" %%% "rc-textarea" % "0.3.7-f8722b",
  "org.scalablytyped" %%% "rc-tooltip" % "5.2.2-fbd57c",
  "org.scalablytyped" %%% "rc-tree" % "5.7.0-57b334",
  "org.scalablytyped" %%% "rc-tree-select" % "5.5.0-39d4a2",
  "org.scalablytyped" %%% "rc-trigger" % "5.3.1-dc7648",
  "org.scalablytyped" %%% "rc-upload" % "4.3.4-da7ffe",
  "org.scalablytyped" %%% "rc-util" % "5.24.4-5666fc",
  "org.scalablytyped" %%% "rc-virtual-list" % "3.4.8-7aa592",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220913Z-bad9e4",
  "org.scalablytyped" %%% "react-dom" % "18.0-dt-20220819Z-97775d",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fce63f",
  "org.scalablytyped" %%% "scroll-into-view-if-needed" % "2.2.29-ba361f",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
