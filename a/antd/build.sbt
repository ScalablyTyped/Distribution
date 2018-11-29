organization := "com.scalablytyped"
name := "antd"
version := "3.10.9-748f20"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ant-design__icons" % "1.1.15-c155c3",
  "com.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-46b922",
  "com.scalablytyped" %%% "array-tree-filter" % "2.1.0-67e05b",
  "com.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-d2b0a8",
  "com.scalablytyped" %%% "create-react-class" % "15.6-dt-20180910Z-aed686",
  "com.scalablytyped" %%% "create-react-context" % "0.2.3-acbc6a",
  "com.scalablytyped" %%% "csstype" % "2.5.7-d075d3",
  "com.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20180910Z-8c0b7c",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-aa3127",
  "com.scalablytyped" %%% "moment" % "2.22.2-cce931",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-c5aad4",
  "com.scalablytyped" %%% "rc-calendar" % "9.7.11-e0d910",
  "com.scalablytyped" %%% "rc-dialog" % "7.2.1-ae8705",
  "com.scalablytyped" %%% "rc-progress" % "2.2-dt-20181120Z-2ba4df",
  "com.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20180910Z-ae05b7",
  "com.scalablytyped" %%% "rc-slider" % "8.6-dt-20180910Z-9902e3",
  "com.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20181104Z-1da7ac",
  "com.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20181121Z-2e34a7",
  "com.scalablytyped" %%% "rc-tree" % "1.11-dt-20180910Z-4c54ab",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181129Z-4e32c2",
  "com.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-40dc87",
  "com.scalablytyped" %%% "react-slick" % "0.23-dt-20180910Z-c3dbf0",
  "com.scalablytyped" %%% "shallowequal" % "v0.2.2-dt-20180910Z-532257",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "warning" % "3.0.0-dt-20180910Z-d608ff",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        