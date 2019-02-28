organization := "org.scalablytyped"
name := "antd"
version := "3.13.6-534138"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.1.16-fd717d",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-8d2a3c",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-0b7b96",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-df7a56",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-126e2e",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-d29593",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20190212Z-206ec7",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-cf3a73",
  "org.scalablytyped" %%% "moment" % "2.24.0-22f1d2",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-3f7dd7",
  "org.scalablytyped" %%% "raf" % "3.4-dt-20190103Z-159450",
  "org.scalablytyped" %%% "rc-calendar" % "9.10.10-7e32df",
  "org.scalablytyped" %%% "rc-dialog" % "7.3.0-96a2d1",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20190212Z-00e573",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20190212Z-a4d0cd",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20190212Z-f5806a",
  "org.scalablytyped" %%% "rc-switch" % "1.8-dt-20190119Z-7903d3",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20190221Z-e7d23d",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20190212Z-0643fd",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20190212Z-e8a290",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190225Z-3dd766",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-2359a8",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-21a4d4",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190126Z-9a1e5d",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-d5f303",
  "org.scalablytyped" %%% "shallowequal" % "1.1-dt-20190202Z-e80a18",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-6ba63e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        