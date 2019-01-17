organization := "org.scalablytyped"
name := "antd"
version := "3.12.3-9a0713"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.1.16-20bc3e",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-26c9f2",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-35ff1a",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-6d1ba2",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-c53395",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-6a47d5",
  "org.scalablytyped" %%% "csstype" % "2.5.8-61e37d",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20180328Z-729aa4",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-5a27ec",
  "org.scalablytyped" %%% "moment" % "2.23.0-fd2546",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-692895",
  "org.scalablytyped" %%% "raf" % "3.4-dt-20190103Z-2a9d06",
  "org.scalablytyped" %%% "rc-calendar" % "9.10.4-4432d3",
  "org.scalablytyped" %%% "rc-dialog" % "7.3.0-36061a",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20181116Z-e14c98",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20180823Z-3d867b",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20180822Z-b16ac4",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20181102Z-c77e80",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20181121Z-418395",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20180803Z-cdc3d6",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190116Z-334a51",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-557855",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-305ce9",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20180806Z-39118f",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-f7416b",
  "org.scalablytyped" %%% "shallowequal" % "1.1-dt-20181231Z-d5a0ce",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-fcf77f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        