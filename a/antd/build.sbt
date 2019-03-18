organization := "org.scalablytyped"
name := "antd"
version := "3.15.1-1ebfab"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.2.1-9219ec",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-84b0b8",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-6d384f",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-25d274",
  "org.scalablytyped" %%% "copy-to-clipboard" % "3.0.8-937a46",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-a2d7c9",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-ea6077",
  "org.scalablytyped" %%% "csstype" % "2.6.3-29f798",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20190212Z-75dfb4",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "moment" % "2.24.0-1d5d22",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190313Z-f6d9fe",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "raf" % "3.4-dt-20190103Z-956f39",
  "org.scalablytyped" %%% "rc-calendar" % "9.10.10-dce15a",
  "org.scalablytyped" %%% "rc-dialog" % "7.3.0-7ceb7a",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20190212Z-24a7fd",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20190212Z-2cf578",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20190218Z-0d3bf6",
  "org.scalablytyped" %%% "rc-switch" % "1.8-dt-20190119Z-9a75ac",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20190221Z-72291a",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20190212Z-fa5818",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20190212Z-1feb9e",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190312Z-6f0f1a",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-7ba1d5",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-51f53d",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190126Z-81e52e",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-a28f79",
  "org.scalablytyped" %%% "shallowequal" % "1.1-dt-20190202Z-aebda3",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-37cf44")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        