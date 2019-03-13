organization := "org.scalablytyped"
name := "antd"
version := "3.15.0-34a47a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.2.1-9219ec",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-b6c02f",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-6d384f",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-25d274",
  "org.scalablytyped" %%% "copy-to-clipboard" % "3.0.8-937a46",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-c5ae87",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-318046",
  "org.scalablytyped" %%% "csstype" % "2.6.3-9f8404",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20190212Z-75dfb4",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "moment" % "2.24.0-1d5d22",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "raf" % "3.4-dt-20190103Z-956f39",
  "org.scalablytyped" %%% "rc-calendar" % "9.10.10-8cd1ab",
  "org.scalablytyped" %%% "rc-dialog" % "7.3.0-6d22ef",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20190212Z-4d7652",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20190212Z-b179a9",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20190218Z-3321fd",
  "org.scalablytyped" %%% "rc-switch" % "1.8-dt-20190119Z-02c280",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20190221Z-1c1bb7",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20190212Z-dc2067",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20190212Z-a126a5",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190312Z-24375e",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-c52751",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-d83baa",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190126Z-b2e3a0",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-a28f79",
  "org.scalablytyped" %%% "shallowequal" % "1.1-dt-20190202Z-aebda3",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-37cf44")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        