organization := "org.scalablytyped"
name := "antd"
version := "3.15.2-89dc21"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.2.1-9219ec",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-253a8b",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-6d384f",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-25d274",
  "org.scalablytyped" %%% "copy-to-clipboard" % "3.0.8-937a46",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-d8ece3",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-b8e6a7",
  "org.scalablytyped" %%% "csstype" % "2.6.3-29f798",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20190212Z-75dfb4",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "moment" % "2.24.0-1d5d22",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190322Z-28a0c1",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "raf" % "3.4-dt-20190103Z-956f39",
  "org.scalablytyped" %%% "rc-calendar" % "9.10.10-6764ea",
  "org.scalablytyped" %%% "rc-dialog" % "7.3.0-68c788",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20190212Z-478ddf",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20190322Z-962d3d",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20190218Z-84cacc",
  "org.scalablytyped" %%% "rc-switch" % "1.8-dt-20190119Z-8788ca",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20190221Z-79eb83",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20190212Z-65e68c",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20190212Z-4d8bdf",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190322Z-6f0f1a",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190322Z-7f8af2",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-6ec056",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190126Z-076ae5",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-a28f79",
  "org.scalablytyped" %%% "shallowequal" % "1.1-dt-20190202Z-aebda3",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20190322Z-37cf44")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        