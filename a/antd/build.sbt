organization := "org.scalablytyped"
name := "antd"
version := "3.13.2-1a174a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.1.16-fd717d",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-69d828",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-0b7b96",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-df7a56",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-0d6ee9",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-7861df",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20180328Z-206ec7",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-cf3a73",
  "org.scalablytyped" %%% "moment" % "2.24.0-22f1d2",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8cdf18",
  "org.scalablytyped" %%% "raf" % "3.4-dt-20190103Z-159450",
  "org.scalablytyped" %%% "rc-calendar" % "9.10.8-d27afa",
  "org.scalablytyped" %%% "rc-dialog" % "7.3.0-35ac28",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20181116Z-30de3f",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20180823Z-982576",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20190130Z-11bc71",
  "org.scalablytyped" %%% "rc-switch" % "1.8-dt-20190119Z-173201",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20181102Z-7ea0a2",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20181121Z-5e3a27",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20180803Z-60c304",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190206Z-d66e8f",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190206Z-33b48d",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-9b947d",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190126Z-95fbc8",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-d5f303",
  "org.scalablytyped" %%% "shallowequal" % "1.1-dt-20190202Z-e80a18",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-6ba63e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        