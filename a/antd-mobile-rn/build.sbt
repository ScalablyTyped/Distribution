organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-f8f4ad"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-ab2410",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20190326Z-9fc905",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-b8207d",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-9164ea",
  "org.scalablytyped" %%% "rc-swipeout" % "2.0.11-fc801d",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190329Z-407a4c",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190327Z-351457",
  "org.scalablytyped" %%% "react-native-collapsible" % "1.4.0-f8a3e5",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-8aa4bc",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-ad6690",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-6be42b",
  "org.scalablytyped" %%% "rmc-date-picker" % "6.0.8-59528b",
  "org.scalablytyped" %%% "rmc-dialog" % "1.1.1-7f47a4",
  "org.scalablytyped" %%% "rmc-feedback" % "2.0.0-46b659",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-fb4beb",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.6-d46e76",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-89179c",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-1ed50b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        