organization := "org.scalablytyped"
name := "antd"
version := "4.23.6-d4cf21"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ant-design__icons" % "4.7.0-af6b35",
  "org.scalablytyped" %%% "ant-design__icons-svg" % "4.2.1-acafe5",
  "org.scalablytyped" %%% "ant-design__react-slick" % "0.29.2-ead447",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "dayjs" % "1.11.5-709f0a",
  "org.scalablytyped" %%% "memoize-one" % "6.0.0-8e0c15",
  "org.scalablytyped" %%% "moment" % "2.29.4-a513be",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4c7983",
  "org.scalablytyped" %%% "rc-cascader" % "3.7.0-e51b4c",
  "org.scalablytyped" %%% "rc-component__portal" % "1.0.0-9-c54a8c",
  "org.scalablytyped" %%% "rc-dialog" % "9.0.0-697491",
  "org.scalablytyped" %%% "rc-drawer" % "6.0.0-8de8d9",
  "org.scalablytyped" %%% "rc-field-form" % "1.27.2-fc2a96",
  "org.scalablytyped" %%% "rc-image" % "5.9.0-d07849",
  "org.scalablytyped" %%% "rc-input" % "0.1.2-b3ddf3",
  "org.scalablytyped" %%% "rc-input-number" % "7.3.9-bbef25",
  "org.scalablytyped" %%% "rc-mentions" % "1.10.0-a8fb3e",
  "org.scalablytyped" %%% "rc-menu" % "9.6.4-334eac",
  "org.scalablytyped" %%% "rc-motion" % "2.6.2-9c3c76",
  "org.scalablytyped" %%% "rc-pagination" % "3.1.17-d4f45e",
  "org.scalablytyped" %%% "rc-picker" % "2.6.11-7915ab",
  "org.scalablytyped" %%% "rc-rate" % "2.9.2-0624fb",
  "org.scalablytyped" %%% "rc-segmented" % "2.1.0-42e63c",
  "org.scalablytyped" %%% "rc-select" % "14.1.13-9c0362",
  "org.scalablytyped" %%% "rc-slider" % "10.0.1-f47c31",
  "org.scalablytyped" %%% "rc-steps" % "5.0.0-alpha.0-0fc6b6",
  "org.scalablytyped" %%% "rc-table" % "7.27.2-f4f282",
  "org.scalablytyped" %%% "rc-tabs" % "12.2.1-ca3905",
  "org.scalablytyped" %%% "rc-textarea" % "0.4.5-5e2eb3",
  "org.scalablytyped" %%% "rc-tooltip" % "5.2.2-ea82e3",
  "org.scalablytyped" %%% "rc-tree" % "5.7.0-d304cb",
  "org.scalablytyped" %%% "rc-tree-select" % "5.5.0-295724",
  "org.scalablytyped" %%% "rc-trigger" % "5.3.1-53f196",
  "org.scalablytyped" %%% "rc-upload" % "4.3.4-6940bb",
  "org.scalablytyped" %%% "rc-util" % "5.24.4-37be05",
  "org.scalablytyped" %%% "rc-virtual-list" % "3.4.8-0c7dd0",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-bacd1f",
  "org.scalablytyped" %%% "react-dom" % "18.0-dt-20220819Z-73fb03",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-400bee",
  "org.scalablytyped" %%% "scroll-into-view-if-needed" % "2.2.29-3dff7e",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
