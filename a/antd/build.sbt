organization := "org.scalablytyped"
name := "antd"
version := "3.15.2-979da8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.2.1-1f3517",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-89291a",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-ab2410",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20190325Z-9fc905",
  "org.scalablytyped" %%% "copy-to-clipboard" % "3.0.8-b2be1d",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-b8207d",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-12f0fd",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20190212Z-ff324a",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190329Z-69a948",
  "org.scalablytyped" %%% "moment" % "2.24.0-da0e25",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "raf" % "3.4-dt-20190103Z-2b5ff3",
  "org.scalablytyped" %%% "rc-calendar" % "9.10.10-c48056",
  "org.scalablytyped" %%% "rc-dialog" % "7.3.0-2e604e",
  "org.scalablytyped" %%% "rc-pagination" % "1.17.13-349908",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20190212Z-975691",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20190322Z-608bf7",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20190218Z-33a036",
  "org.scalablytyped" %%% "rc-switch" % "1.8-dt-20190119Z-809ccf",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20190221Z-17b707",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20190212Z-bc2509",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20190212Z-6c9def",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190329Z-407a4c",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190322Z-3be409",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-960518",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190126Z-21ad7b",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-d41765",
  "org.scalablytyped" %%% "shallowequal" % "1.1-dt-20190202Z-0aa1a4",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20190322Z-34051e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        