organization := "com.scalablytyped"
name := "antd"
version := "3.10.9-f52704"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ant-design__icons" % "1.1.15-c155c3",
  "com.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-5ca3d4",
  "com.scalablytyped" %%% "array-tree-filter" % "2.1.0-67e05b",
  "com.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-d2b0a8",
  "com.scalablytyped" %%% "create-react-class" % "15.6-dt-20180910Z-ab2b72",
  "com.scalablytyped" %%% "create-react-context" % "0.2.3-e558e0",
  "com.scalablytyped" %%% "csstype" % "2.5.7-d075d3",
  "com.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20180910Z-8c0b7c",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-aa3127",
  "com.scalablytyped" %%% "moment" % "2.22.2-cce931",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-c5aad4",
  "com.scalablytyped" %%% "rc-calendar" % "9.7.11-5fbaa8",
  "com.scalablytyped" %%% "rc-dialog" % "7.2.1-936f9a",
  "com.scalablytyped" %%% "rc-progress" % "2.2-dt-20181120Z-ac4018",
  "com.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20180910Z-8d0757",
  "com.scalablytyped" %%% "rc-slider" % "8.6-dt-20180910Z-a18cab",
  "com.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20181104Z-e3074d",
  "com.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20181121Z-db3451",
  "com.scalablytyped" %%% "rc-tree" % "1.11-dt-20180910Z-21bb87",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181203Z-843f9f",
  "com.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-0eb952",
  "com.scalablytyped" %%% "react-slick" % "0.23-dt-20180910Z-fd1ed9",
  "com.scalablytyped" %%% "shallowequal" % "v0.2.2-dt-20180910Z-532257",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "warning" % "3.0.0-dt-20180910Z-d608ff",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        