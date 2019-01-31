organization := "org.scalablytyped"
name := "antd"
version := "3.13.0-5d745a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.1.16-179f77",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-94dfb7",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-b694b7",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-4ddc67",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-60f68f",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-b43647",
  "org.scalablytyped" %%% "csstype" % "2.5.8-ae54dc",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20180328Z-4322ed",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-e5b16b",
  "org.scalablytyped" %%% "moment" % "2.24.0-cd7f45",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-d610b9",
  "org.scalablytyped" %%% "raf" % "3.4-dt-20190103Z-210238",
  "org.scalablytyped" %%% "rc-calendar" % "9.10.4-1a90fc",
  "org.scalablytyped" %%% "rc-dialog" % "7.3.0-f5e4bb",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20181116Z-c1b6b8",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20180823Z-85066e",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20180822Z-9c7d83",
  "org.scalablytyped" %%% "rc-switch" % "1.8-dt-20190119Z-b94553",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20181102Z-9e0c27",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20181121Z-7fc54d",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20180803Z-38c42e",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190131Z-997ec6",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-e377db",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-79ef67",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190126Z-fc496d",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-bb0c31",
  "org.scalablytyped" %%% "shallowequal" % "1.1-dt-20181231Z-41ea05",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-3afbda")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        