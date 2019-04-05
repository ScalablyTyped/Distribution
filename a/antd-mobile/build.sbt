organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.2.11-a75fff"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-ab2410",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20190326Z-9fc905",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-b404e2",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "exenv" % "1.2-dt-20180321Z-41e225",
  "org.scalablytyped" %%% "moment" % "2.24.0-da0e25",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "raf" % "3.4-dt-20190103Z-2b5ff3",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-7bd65c",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20190218Z-0625a0",
  "org.scalablytyped" %%% "rc-swipeout" % "2.0.11-f1a9af",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20190212Z-d51afd",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-d8f967",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-f6f039",
  "org.scalablytyped" %%% "rmc-align" % "1.0.0-d09839",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-320b78",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-0a3a91",
  "org.scalablytyped" %%% "rmc-date-picker" % "6.0.9-7738be",
  "org.scalablytyped" %%% "rmc-dialog" % "1.1.1-373091",
  "org.scalablytyped" %%% "rmc-drawer" % "0.4-dt-20190221Z-c2f54b",
  "org.scalablytyped" %%% "rmc-feedback" % "2.0.0-446480",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-cb913b",
  "org.scalablytyped" %%% "rmc-nuka-carousel" % "3.0.1-579b23",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.8-c2307f",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-621b37",
  "org.scalablytyped" %%% "rmc-steps" % "1.0.0-b688d6",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-005ade",
  "org.scalablytyped" %%% "rmc-tooltip" % "1.0.1-1a1676",
  "org.scalablytyped" %%% "rmc-trigger" % "1.0.12-2d6add",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        