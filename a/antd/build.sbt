organization := "org.scalablytyped"
name := "antd"
version := "3.16.2-4f1fcc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.2.1-1f3517",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.4-da3652",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-ab2410",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20190326Z-9fc905",
  "org.scalablytyped" %%% "copy-to-clipboard" % "3.1.0-b2be1d",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-b404e2",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-7b4635",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20190212Z-ff324a",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-69a948",
  "org.scalablytyped" %%% "moment" % "2.24.0-da0e25",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "raf" % "3.4-dt-20190103Z-2b5ff3",
  "org.scalablytyped" %%% "rc-calendar" % "9.12.3-a354f8",
  "org.scalablytyped" %%% "rc-dialog" % "7.3.1-b860ba",
  "org.scalablytyped" %%% "rc-pagination" % "1.17.13-7e9a36",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20190212Z-db0354",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20190322Z-39df32",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20190218Z-0625a0",
  "org.scalablytyped" %%% "rc-switch" % "1.8-dt-20190119Z-8e7b33",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20190221Z-b8abc5",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20190212Z-d51afd",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20190212Z-a317e6",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-d8f967",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190322Z-9aa93f",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-97a21c",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190126Z-ba6239",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-d41765",
  "org.scalablytyped" %%% "shallowequal" % "1.1-dt-20190202Z-0aa1a4",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20190322Z-34051e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        