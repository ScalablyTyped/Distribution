organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.2.11-be464f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-ab2410",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20190326Z-9fc905",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-b8207d",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "exenv" % "1.2-dt-20180321Z-41e225",
  "org.scalablytyped" %%% "moment" % "2.24.0-da0e25",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "raf" % "3.4-dt-20190103Z-2b5ff3",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-9164ea",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20190218Z-33a036",
  "org.scalablytyped" %%% "rc-swipeout" % "2.0.11-fc801d",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20190212Z-bc2509",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190329Z-407a4c",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-ad6690",
  "org.scalablytyped" %%% "rmc-align" % "1.0.0-ba675c",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-ad1228",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-6be42b",
  "org.scalablytyped" %%% "rmc-date-picker" % "6.0.9-5a5300",
  "org.scalablytyped" %%% "rmc-dialog" % "1.1.1-7f47a4",
  "org.scalablytyped" %%% "rmc-drawer" % "0.4-dt-20190221Z-8184d3",
  "org.scalablytyped" %%% "rmc-feedback" % "2.0.0-46b659",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-fb4beb",
  "org.scalablytyped" %%% "rmc-nuka-carousel" % "3.0.1-c50071",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.6-d46e76",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-bdf3ee",
  "org.scalablytyped" %%% "rmc-steps" % "1.0.0-48b79b",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-89179c",
  "org.scalablytyped" %%% "rmc-tooltip" % "1.0.1-edea13",
  "org.scalablytyped" %%% "rmc-trigger" % "1.0.12-d54229",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        