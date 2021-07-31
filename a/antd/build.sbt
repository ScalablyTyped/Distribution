organization := "org.scalablytyped"
name := "antd"
version := "4.8.5-425db4"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ant-design__icons" % "4.3.0-40f4e2",
  "org.scalablytyped" %%% "ant-design__icons-svg" % "4.1.0-5c4321",
  "org.scalablytyped" %%% "ant-design__react-slick" % "0.27.14-05e1ec",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b8d190",
  "org.scalablytyped" %%% "dayjs" % "1.9.6-3a1e70",
  "org.scalablytyped" %%% "moment" % "2.29.1-445fa8",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-a12f9a",
  "org.scalablytyped" %%% "rc-dialog" % "8.4.3-c5528f",
  "org.scalablytyped" %%% "rc-field-form" % "1.17.2-86e22b",
  "org.scalablytyped" %%% "rc-image" % "4.0.1-ffdb93",
  "org.scalablytyped" %%% "rc-mentions" % "1.5.2-8a3ab3",
  "org.scalablytyped" %%% "rc-menu" % "8.10.0-8445ad",
  "org.scalablytyped" %%% "rc-motion" % "2.4.1-4488a2",
  "org.scalablytyped" %%% "rc-notification" % "4.5.4-2e954d",
  "org.scalablytyped" %%% "rc-picker" % "2.4.1-808848",
  "org.scalablytyped" %%% "rc-select" % "11.4.2-0da5e4",
  "org.scalablytyped" %%% "rc-table" % "7.11.2-b96eab",
  "org.scalablytyped" %%% "rc-tabs" % "11.7.1-140d88",
  "org.scalablytyped" %%% "rc-textarea" % "0.3.1-e7b034",
  "org.scalablytyped" %%% "rc-tooltip" % "5.0.1-6cffd8",
  "org.scalablytyped" %%% "rc-tree" % "3.11.0-baada9",
  "org.scalablytyped" %%% "rc-tree-select" % "4.1.3-26137a",
  "org.scalablytyped" %%% "rc-trigger" % "5.1.2-dbff19",
  "org.scalablytyped" %%% "rc-util" % "5.5.0-f72d78",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-c80121",
  "org.scalablytyped" %%% "scroll-into-view-if-needed" % "2.2.26-c32c60",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
