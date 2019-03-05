organization := "org.scalablytyped"
name := "antd"
version := "3.14.1-e74fa5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.2.1-0d6238",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-e82e0c",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-2b8918",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-3f1c68",
  "org.scalablytyped" %%% "copy-to-clipboard" % "3.0.8-9558ac",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-d713de",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-0cf44b",
  "org.scalablytyped" %%% "csstype" % "2.6.3-60f3ea",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20190212Z-108027",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190227Z-56553a",
  "org.scalablytyped" %%% "moment" % "2.24.0-77c476",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-0b0b5e",
  "org.scalablytyped" %%% "raf" % "3.4-dt-20190103Z-6bf0c5",
  "org.scalablytyped" %%% "rc-calendar" % "9.10.10-b0f702",
  "org.scalablytyped" %%% "rc-dialog" % "7.3.0-92ac3c",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20190212Z-8ad4fd",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20190212Z-08c20f",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20190212Z-1624e7",
  "org.scalablytyped" %%% "rc-switch" % "1.8-dt-20190119Z-a38a01",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20190221Z-a519d4",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20190212Z-c98ef2",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20190212Z-fbf306",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-f7f3c1",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-502e31",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-04d20e",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190126Z-835927",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-361c07",
  "org.scalablytyped" %%% "shallowequal" % "1.1-dt-20190202Z-7061ce",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-d21fb1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        