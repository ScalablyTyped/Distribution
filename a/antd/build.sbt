organization := "org.scalablytyped"
name := "antd"
version := "3.11.2-3315f9"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.1.16-f713ba",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-6cb2e4",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-7033d7",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-c23652",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180910Z-6300c1",
  "org.scalablytyped" %%% "create-react-context" % "0.2.3-c42d7a",
  "org.scalablytyped" %%% "csstype" % "2.5.8-939493",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20180910Z-a50a00",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "moment" % "2.22.2-90ee67",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-7481e3",
  "org.scalablytyped" %%% "rc-calendar" % "9.8.1-922dfb",
  "org.scalablytyped" %%% "rc-dialog" % "7.2.1-088b54",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20181120Z-3fac03",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20180910Z-5211cd",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20180910Z-8171a9",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20181104Z-0ef284",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20181121Z-60ee76",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20180910Z-ed2404",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181212Z-14da82",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-93dab0",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20180910Z-ac1003",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-f42599",
  "org.scalablytyped" %%% "shallowequal" % "v0.2.2-dt-20180910Z-50ec57",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180910Z-67a080")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        