organization := "org.scalablytyped"
name := "antd"
version := "3.11.0-3b633f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.1.16-fd04f0",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-f46cab",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-883012",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-f5e9e0",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180910Z-99aeb5",
  "org.scalablytyped" %%% "create-react-context" % "0.2.3-a2824b",
  "org.scalablytyped" %%% "csstype" % "2.5.8-bb2c56",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20180910Z-cc9ea1",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-3dc8be",
  "org.scalablytyped" %%% "moment" % "2.22.2-39aab6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-dcbd7c",
  "org.scalablytyped" %%% "rc-calendar" % "9.8.1-daa47e",
  "org.scalablytyped" %%% "rc-dialog" % "7.2.1-701b59",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20181120Z-13be1c",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20180910Z-4be5f8",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20180910Z-b32ff6",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20181104Z-6317e5",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20181121Z-f53c69",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20180910Z-b8ebd1",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-65cffa",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-221490",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20180910Z-47cea3",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.0-7d74a3",
  "org.scalablytyped" %%% "shallowequal" % "v0.2.2-dt-20180910Z-337b8d",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180910Z-5828e4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        