organization := "com.scalablytyped"
name := "antd"
version := "3.10.3-162845"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ant-design__icons" % "1.1.15-a77f00",
  "com.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-b0aacb",
  "com.scalablytyped" %%% "array-tree-filter" % "2.1.0-c68165",
  "com.scalablytyped" %%% "classnames" % "2.2-dt-20181102Z-4c332c",
  "com.scalablytyped" %%% "create-react-class" % "15.6-dt-20181102Z-877e55",
  "com.scalablytyped" %%% "create-react-context" % "0.2.3-d5f39a",
  "com.scalablytyped" %%% "csstype" % "2.5.7-8f5757",
  "com.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20181102Z-4c5e71",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181109Z-67570f",
  "com.scalablytyped" %%% "moment" % "2.22.2-e2e353",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20181102Z-3c49da",
  "com.scalablytyped" %%% "rc-calendar" % "9.7.11-b95997",
  "com.scalablytyped" %%% "rc-dialog" % "7.2.1-278ac2",
  "com.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20181102Z-3bbac2",
  "com.scalablytyped" %%% "rc-slider" % "8.6-dt-20181102Z-58c3c8",
  "com.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20181103Z-b4c78b",
  "com.scalablytyped" %%% "rc-tooltip" % "v3.4.2-dt-20181102Z-e4beac",
  "com.scalablytyped" %%% "rc-tree" % "1.11-dt-20181102Z-0c6a84",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181116Z-28281f",
  "com.scalablytyped" %%% "react-dom" % "16.0-dt-20181102Z-1c0420",
  "com.scalablytyped" %%% "react-slick" % "0.23-dt-20181102Z-1ae763",
  "com.scalablytyped" %%% "shallowequal" % "v0.2.2-dt-20181102Z-759045",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "warning" % "3.0.0-dt-20181102Z-fa475f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        