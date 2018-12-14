organization := "org.scalablytyped"
name := "antd"
version := "3.11.2-020873"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.1.16-f58184",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-9a16ac",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-e23ed6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-4a9357",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180910Z-85f65a",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-508142",
  "org.scalablytyped" %%% "csstype" % "2.5.8-eb24f4",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20180910Z-fe60db",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-17fe49",
  "org.scalablytyped" %%% "moment" % "2.23.0-39ab00",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-32d5ea",
  "org.scalablytyped" %%% "rc-calendar" % "9.8.1-022875",
  "org.scalablytyped" %%% "rc-dialog" % "7.2.1-946643",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20181120Z-292019",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20180910Z-215bbc",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20180910Z-4298d6",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20181104Z-099b21",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20181121Z-db551e",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20180910Z-5ce64c",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181213Z-7d04f8",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-71b187",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20180910Z-dd657b",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-f5e410",
  "org.scalablytyped" %%% "shallowequal" % "v0.2.2-dt-20180910Z-89ad38",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180910Z-f07668")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        