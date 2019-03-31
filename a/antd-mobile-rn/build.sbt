organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-064376"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-ab2410",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20190325Z-9fc905",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-b8207d",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-9164ea",
  "org.scalablytyped" %%% "rc-swipeout" % "2.0.11-44d407",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190329Z-407a4c",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190327Z-351457",
  "org.scalablytyped" %%% "react-native-collapsible" % "1.4.0-f8a3e5",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-8aa4bc",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-ad6690",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-b83d5a",
  "org.scalablytyped" %%% "rmc-date-picker" % "6.0.8-381d75",
  "org.scalablytyped" %%% "rmc-dialog" % "1.1.1-7f47a4",
  "org.scalablytyped" %%% "rmc-feedback" % "2.0.0-e8e69e",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-659ee2",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.6-f32d55",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-89179c",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-1ed50b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        