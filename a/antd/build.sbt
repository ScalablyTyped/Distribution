organization := "org.scalablytyped"
name := "antd"
version := "3.15.2-396096"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.2.1-a62cf9",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-30212f",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-25934d",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20190325Z-43290b",
  "org.scalablytyped" %%% "copy-to-clipboard" % "3.0.8-76f759",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-0185fc",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-274248",
  "org.scalablytyped" %%% "csstype" % "2.6.3-9dec0a",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20190212Z-ad59ba",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-7a74e5",
  "org.scalablytyped" %%% "moment" % "2.24.0-584f36",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-1549d2",
  "org.scalablytyped" %%% "raf" % "3.4-dt-20190103Z-afb994",
  "org.scalablytyped" %%% "rc-calendar" % "9.10.10-2b7d1b",
  "org.scalablytyped" %%% "rc-dialog" % "7.3.0-a7f319",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20190212Z-7d19a7",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20190322Z-a49063",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20190218Z-0a3942",
  "org.scalablytyped" %%% "rc-switch" % "1.8-dt-20190119Z-0ea68f",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20190221Z-690cce",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20190212Z-0a6a58",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20190212Z-86299d",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190322Z-acd0bd",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190322Z-84fa90",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-a10fdd",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190126Z-eff7cc",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-a1e549",
  "org.scalablytyped" %%% "shallowequal" % "1.1-dt-20190202Z-dc3836",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20190322Z-0765f0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        