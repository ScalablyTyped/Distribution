organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-181787"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-ab2410",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20190326Z-9fc905",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-b404e2",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-7bd65c",
  "org.scalablytyped" %%% "rc-swipeout" % "2.0.11-f1a9af",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-d8f967",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190327Z-f86512",
  "org.scalablytyped" %%% "react-native-collapsible" % "1.4.0-313e01",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-980f65",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-f6f039",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-0a3a91",
  "org.scalablytyped" %%% "rmc-date-picker" % "6.0.9-7738be",
  "org.scalablytyped" %%% "rmc-dialog" % "1.1.1-373091",
  "org.scalablytyped" %%% "rmc-feedback" % "2.0.0-446480",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-cb913b",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.8-c2307f",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-005ade",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-1ed50b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        