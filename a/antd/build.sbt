organization := "org.scalablytyped"
name := "antd"
version := "3.11.3-02a3d5"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.1.16-5105ac",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-eafdf1",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-ddb650",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180721Z-d403a0",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-9787cb",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-05dfa3",
  "org.scalablytyped" %%% "csstype" % "2.5.8-28635b",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20180328Z-f4605b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-b7dcf8",
  "org.scalablytyped" %%% "moment" % "2.23.0-f391bb",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-3109dd",
  "org.scalablytyped" %%% "rc-calendar" % "9.8.2-7c6ed2",
  "org.scalablytyped" %%% "rc-dialog" % "7.2.1-1c0606",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20181116Z-582beb",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20180823Z-cf4754",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20180822Z-56ec9a",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20181102Z-350fa1",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20181121Z-ac9993",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20180803Z-4a0f32",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-b38950",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-d008b6",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20180806Z-ea4cf3",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-bfad26",
  "org.scalablytyped" %%% "shallowequal" % "v0.2.2-dt-20180612Z-8ea713",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-ce2f42")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        