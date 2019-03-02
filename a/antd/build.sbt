organization := "org.scalablytyped"
name := "antd"
version := "3.13.6-0f8a47"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.1.16-e35759",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-6899e6",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-344e33",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-2b6900",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-01fa58",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-2cc11d",
  "org.scalablytyped" %%% "csstype" % "2.6.2-481742",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20190212Z-3b8c2d",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-f3a537",
  "org.scalablytyped" %%% "moment" % "2.24.0-737009",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-66c044",
  "org.scalablytyped" %%% "raf" % "3.4-dt-20190103Z-22bac2",
  "org.scalablytyped" %%% "rc-calendar" % "9.10.10-bcbc15",
  "org.scalablytyped" %%% "rc-dialog" % "7.3.0-5e1dbd",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20190212Z-d490cf",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20190212Z-6454da",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20190212Z-7cfa39",
  "org.scalablytyped" %%% "rc-switch" % "1.8-dt-20190119Z-5833af",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20190221Z-45fc0b",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20190212Z-a46c51",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20190212Z-be45f4",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-9e9d73",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-4ff3b1",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-68cebb",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190126Z-ee4841",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-c52a23",
  "org.scalablytyped" %%% "shallowequal" % "1.1-dt-20190202Z-f7d7b1",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-80eb49")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        