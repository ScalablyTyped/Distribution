organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.2.11-8a13e6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-ab2410",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20190326Z-9fc905",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-1dd4de",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "exenv" % "1.2-dt-20180321Z-41e225",
  "org.scalablytyped" %%% "moment" % "2.24.0-da0e25",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "raf" % "3.4-dt-20190103Z-2b5ff3",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-bd1b2d",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20190218Z-5e5c21",
  "org.scalablytyped" %%% "rc-swipeout" % "2.0.11-3f4fa8",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20190212Z-298b48",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-3351b3",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-c3ac9c",
  "org.scalablytyped" %%% "rmc-align" % "1.0.0-f2c862",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-d9c8ed",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-2589a0",
  "org.scalablytyped" %%% "rmc-date-picker" % "6.0.9-ec72d4",
  "org.scalablytyped" %%% "rmc-dialog" % "1.1.1-5456fb",
  "org.scalablytyped" %%% "rmc-drawer" % "0.4-dt-20190221Z-ac7586",
  "org.scalablytyped" %%% "rmc-feedback" % "2.0.0-e7cc4d",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-ce1765",
  "org.scalablytyped" %%% "rmc-nuka-carousel" % "3.0.1-2faa4c",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.8-a4e7af",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-0c42f3",
  "org.scalablytyped" %%% "rmc-steps" % "1.0.0-2e116b",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-4605e1",
  "org.scalablytyped" %%% "rmc-tooltip" % "1.0.1-7c24fa",
  "org.scalablytyped" %%% "rmc-trigger" % "1.0.12-8e6a23",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        