organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-67c8c6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-ab2410",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20190326Z-9fc905",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-1dd4de",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-bd1b2d",
  "org.scalablytyped" %%% "rc-swipeout" % "2.0.11-3f4fa8",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-3351b3",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190410Z-5e5772",
  "org.scalablytyped" %%% "react-native-collapsible" % "1.4.0-816d72",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-b9599b",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-c3ac9c",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-2589a0",
  "org.scalablytyped" %%% "rmc-date-picker" % "6.0.9-ec72d4",
  "org.scalablytyped" %%% "rmc-dialog" % "1.1.1-5456fb",
  "org.scalablytyped" %%% "rmc-feedback" % "2.0.0-e7cc4d",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-ce1765",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.8-a4e7af",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-4605e1",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-1ed50b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        