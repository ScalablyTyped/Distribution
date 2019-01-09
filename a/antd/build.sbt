organization := "org.scalablytyped"
name := "antd"
version := "3.12.1-cca170"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.1.16-251328",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-151271",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-33945a",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-9719bb",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-fcfcda",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-83ce64",
  "org.scalablytyped" %%% "csstype" % "2.5.8-82546d",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20180328Z-01b67c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-010a28",
  "org.scalablytyped" %%% "moment" % "2.23.0-e5bac4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-ff1a88",
  "org.scalablytyped" %%% "raf" % "3.4-dt-20190103Z-5a3171",
  "org.scalablytyped" %%% "rc-calendar" % "9.10.4-28e196",
  "org.scalablytyped" %%% "rc-dialog" % "7.3.0-8b3f85",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20181116Z-4bbe2b",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20180823Z-c7dd9d",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20180822Z-9289ae",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20181102Z-8e532e",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20181121Z-6f9b4d",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20180803Z-8d2917",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-8bb0ba",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-a4376a",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20180806Z-4061fd",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-4811ae",
  "org.scalablytyped" %%% "shallowequal" % "1.1-dt-20181231Z-b713e7",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-abe80a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        