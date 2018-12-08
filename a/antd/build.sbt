organization := "org.scalablytyped"
name := "antd"
version := "3.11.0-cbc74f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.1.16-fd04f0",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-cec3a6",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-883012",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-f5e9e0",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180910Z-6d5890",
  "org.scalablytyped" %%% "create-react-context" % "0.2.3-768e43",
  "org.scalablytyped" %%% "csstype" % "2.5.8-bb2c56",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20180910Z-cc9ea1",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-3dc8be",
  "org.scalablytyped" %%% "moment" % "2.22.2-39aab6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-000ab2",
  "org.scalablytyped" %%% "rc-calendar" % "9.8.1-1c77e2",
  "org.scalablytyped" %%% "rc-dialog" % "7.2.1-f16eda",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20181120Z-475b75",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20180910Z-25e17a",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20180910Z-752668",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20181104Z-6741ae",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20181121Z-1c2efb",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20180910Z-983563",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-1b8e7c",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-c1bc9b",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20180910Z-3c7c81",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.0-7d74a3",
  "org.scalablytyped" %%% "shallowequal" % "v0.2.2-dt-20180910Z-337b8d",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180910Z-5828e4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        