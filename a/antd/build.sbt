organization := "org.scalablytyped"
name := "antd"
version := "3.13.0-780dad"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.1.16-fd717d",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-c55edd",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-0b7b96",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-df7a56",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-5fe140",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-1716e4",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20180328Z-206ec7",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-cf3a73",
  "org.scalablytyped" %%% "moment" % "2.24.0-22f1d2",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8cdf18",
  "org.scalablytyped" %%% "raf" % "3.4-dt-20190103Z-159450",
  "org.scalablytyped" %%% "rc-calendar" % "9.10.8-af759a",
  "org.scalablytyped" %%% "rc-dialog" % "7.3.0-9136a3",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20181116Z-737ff0",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20180823Z-c1d142",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20180822Z-c0387d",
  "org.scalablytyped" %%% "rc-switch" % "1.8-dt-20190119Z-fbc0f7",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20181102Z-38717c",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20181121Z-2d7732",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20180803Z-41ee48",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190201Z-f7085e",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-830073",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-fdc198",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190126Z-79eae3",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-d5f303",
  "org.scalablytyped" %%% "shallowequal" % "1.1-dt-20181231Z-5a2f1c",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-6ba63e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        