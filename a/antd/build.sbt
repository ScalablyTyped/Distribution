organization := "org.scalablytyped"
name := "antd"
version := "3.11.1-288b32"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.1.16-75bcfc",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-0a19d8",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-031f6c",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-09df87",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180910Z-547321",
  "org.scalablytyped" %%% "create-react-context" % "0.2.3-fae7dc",
  "org.scalablytyped" %%% "csstype" % "2.5.8-b451f0",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20180910Z-ecb328",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-e3741e",
  "org.scalablytyped" %%% "moment" % "2.22.2-d1dfb5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-87c4ee",
  "org.scalablytyped" %%% "rc-calendar" % "9.8.1-d72b1c",
  "org.scalablytyped" %%% "rc-dialog" % "7.2.1-10a277",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20181120Z-0cc824",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20180910Z-5648f5",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20180910Z-fe8c15",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20181104Z-44e987",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20181121Z-212022",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20180910Z-f3b57f",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-d83ef6",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-d04ae5",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20180910Z-649359",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-36069e",
  "org.scalablytyped" %%% "shallowequal" % "v0.2.2-dt-20180910Z-bde5d5",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180910Z-529c30")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        