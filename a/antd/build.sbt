organization := "org.scalablytyped"
name := "antd"
version := "4.8.5-e0d7ba"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ant-design__icons" % "4.3.0-bc2d0a",
  "org.scalablytyped" %%% "ant-design__icons-svg" % "4.1.0-1d7404",
  "org.scalablytyped" %%% "ant-design__react-slick" % "0.27.14-8c344e",
  "org.scalablytyped" %%% "csstype" % "2.6.14-344a29",
  "org.scalablytyped" %%% "dayjs" % "1.9.6-24693f",
  "org.scalablytyped" %%% "moment" % "2.29.1-f52f14",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-49dd4c",
  "org.scalablytyped" %%% "rc-dialog" % "8.4.3-53a257",
  "org.scalablytyped" %%% "rc-field-form" % "1.17.2-901d68",
  "org.scalablytyped" %%% "rc-image" % "4.0.1-38700b",
  "org.scalablytyped" %%% "rc-mentions" % "1.5.2-0275f3",
  "org.scalablytyped" %%% "rc-menu" % "8.10.0-e0dc85",
  "org.scalablytyped" %%% "rc-motion" % "2.4.1-2b083e",
  "org.scalablytyped" %%% "rc-notification" % "4.5.4-c625fe",
  "org.scalablytyped" %%% "rc-picker" % "2.4.1-0d46e9",
  "org.scalablytyped" %%% "rc-select" % "11.4.2-c4b105",
  "org.scalablytyped" %%% "rc-table" % "7.11.2-9afb9f",
  "org.scalablytyped" %%% "rc-tabs" % "11.7.1-f76d4b",
  "org.scalablytyped" %%% "rc-textarea" % "0.3.1-7421a9",
  "org.scalablytyped" %%% "rc-tooltip" % "5.0.1-73728e",
  "org.scalablytyped" %%% "rc-tree" % "3.11.0-96ef07",
  "org.scalablytyped" %%% "rc-tree-select" % "4.1.3-63b02f",
  "org.scalablytyped" %%% "rc-trigger" % "5.1.2-6178aa",
  "org.scalablytyped" %%% "rc-util" % "5.5.0-bc4d40",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-76d083",
  "org.scalablytyped" %%% "scroll-into-view-if-needed" % "2.2.26-903bf9",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
