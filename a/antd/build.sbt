organization := "org.scalablytyped"
name := "antd"
version := "3.13.0-3cd73e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.1.16-657c68",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-d737f7",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-721329",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-8c0e09",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-7a448c",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-85b28c",
  "org.scalablytyped" %%% "csstype" % "2.5.8-36deb1",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20180328Z-da961e",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-c48db4",
  "org.scalablytyped" %%% "moment" % "2.24.0-68abed",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-e51e1e",
  "org.scalablytyped" %%% "raf" % "3.4-dt-20190103Z-0f3580",
  "org.scalablytyped" %%% "rc-calendar" % "9.10.4-9e6cac",
  "org.scalablytyped" %%% "rc-dialog" % "7.3.0-70f1cb",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20181116Z-35f874",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20180823Z-b0aaaf",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20180822Z-13f7b7",
  "org.scalablytyped" %%% "rc-switch" % "1.8-dt-20190119Z-6a6237",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20181102Z-533a45",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20181121Z-1b6973",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20180803Z-8bcaf3",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190126Z-a37585",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-931147",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-649ae5",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190126Z-1aa01e",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-3dfab5",
  "org.scalablytyped" %%% "shallowequal" % "1.1-dt-20181231Z-1bbd3d",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-9bcf7b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        