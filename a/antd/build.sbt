organization := "org.scalablytyped"
name := "antd"
version := "3.11.2-3ac646"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.1.16-f713ba",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-59ef46",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-7033d7",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-c23652",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180910Z-e07beb",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-96a71a",
  "org.scalablytyped" %%% "csstype" % "2.5.8-939493",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20180910Z-a50a00",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "moment" % "2.23.0-1a181b",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-7481e3",
  "org.scalablytyped" %%% "rc-calendar" % "9.8.1-d7bf49",
  "org.scalablytyped" %%% "rc-dialog" % "7.2.1-f7dd26",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20181120Z-e6f9fe",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20180910Z-9d274c",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20180910Z-d7dcea",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20181104Z-082422",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20181121Z-b27cfb",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20180910Z-5ec4ee",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181213Z-296d60",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-0f3c05",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20180910Z-835d92",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-f42599",
  "org.scalablytyped" %%% "shallowequal" % "v0.2.2-dt-20180910Z-50ec57",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180910Z-67a080")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        