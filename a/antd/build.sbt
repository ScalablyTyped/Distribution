organization := "org.scalablytyped"
name := "antd"
version := "3.11.6-f186fc"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.1.16-e54412",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-44a578",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-d4cfdd",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180721Z-b84a90",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-da0e58",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-36e706",
  "org.scalablytyped" %%% "csstype" % "2.5.8-a13970",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20180328Z-415d1c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-0a02fb",
  "org.scalablytyped" %%% "moment" % "2.23.0-9a5931",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-89199d",
  "org.scalablytyped" %%% "rc-calendar" % "9.8.2-c88935",
  "org.scalablytyped" %%% "rc-dialog" % "7.2.1-8496a8",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20181116Z-99eb07",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20180823Z-9232b8",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20180822Z-b36c8c",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20181102Z-57e3c9",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20181121Z-c35c9f",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20180803Z-3bd231",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-3dff88",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-8054fe",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20180806Z-eeab4f",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-590f83",
  "org.scalablytyped" %%% "shallowequal" % "v0.2.2-dt-20180612Z-a96395",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-292246")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        