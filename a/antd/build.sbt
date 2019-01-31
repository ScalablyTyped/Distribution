organization := "org.scalablytyped"
name := "antd"
version := "3.13.0-50ed9b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.1.16-657c68",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-5bd78f",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-721329",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-8c0e09",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-1f56bd",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-6d11f9",
  "org.scalablytyped" %%% "csstype" % "2.5.8-36deb1",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20180328Z-da961e",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-c48db4",
  "org.scalablytyped" %%% "moment" % "2.24.0-68abed",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-40209e",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-e51e1e",
  "org.scalablytyped" %%% "raf" % "3.4-dt-20190103Z-0f3580",
  "org.scalablytyped" %%% "rc-calendar" % "9.10.4-0ad1ac",
  "org.scalablytyped" %%% "rc-dialog" % "7.3.0-bd06dc",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20181116Z-fdfe86",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20180823Z-e4d018",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20180822Z-bf2135",
  "org.scalablytyped" %%% "rc-switch" % "1.8-dt-20190119Z-b801ef",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20181102Z-fe0b2f",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20181121Z-dabfc5",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20180803Z-b41f19",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190128Z-cfd22c",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-40bb02",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-4ed100",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190126Z-988953",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-3dfab5",
  "org.scalablytyped" %%% "shallowequal" % "1.1-dt-20181231Z-1bbd3d",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-9bcf7b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        