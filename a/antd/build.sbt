organization := "org.scalablytyped"
name := "antd"
version := "3.15.1-b42d71"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.2.1-9219ec",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-82cd50",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-6d384f",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-25d274",
  "org.scalablytyped" %%% "copy-to-clipboard" % "3.0.8-937a46",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-7a7aee",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-e09e9c",
  "org.scalablytyped" %%% "csstype" % "2.6.3-29f798",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20190212Z-75dfb4",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "moment" % "2.24.0-1d5d22",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190320Z-26b6b7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "raf" % "3.4-dt-20190103Z-956f39",
  "org.scalablytyped" %%% "rc-calendar" % "9.10.10-604e59",
  "org.scalablytyped" %%% "rc-dialog" % "7.3.0-7429e8",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20190212Z-8e0c02",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20190212Z-bde31a",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20190218Z-e8165b",
  "org.scalablytyped" %%% "rc-switch" % "1.8-dt-20190119Z-57ea34",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20190221Z-3d3676",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20190212Z-25c8ee",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20190212Z-76ea3a",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190314Z-6f0f1a",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190320Z-5412f7",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-10a570",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190126Z-e906fc",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-a28f79",
  "org.scalablytyped" %%% "shallowequal" % "1.1-dt-20190202Z-aebda3",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-37cf44")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        