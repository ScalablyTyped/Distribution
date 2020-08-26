organization := "org.scalablytyped"
name := "ant-design-pro"
version := "2.3.2-9c13d4"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ant-design__icons" % "4.2.1-ed3c40",
  "org.scalablytyped" %%% "ant-design__icons-svg" % "4.1.0-8d0ed6",
  "org.scalablytyped" %%% "ant-design__react-slick" % "0.27.0-207772",
  "org.scalablytyped" %%% "antd" % "4.5.1-c3e170",
  "org.scalablytyped" %%% "antv__g2" % "3.5.15-2010f9",
  "org.scalablytyped" %%% "bizcharts" % "3.5.9-d08b4a",
  "org.scalablytyped" %%% "csstype" % "3.0.2-b6fa26",
  "org.scalablytyped" %%% "dayjs" % "1.8.31-c7c1b0",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200518Z-4d6e63",
  "org.scalablytyped" %%% "moment" % "2.27.0-2a4db1",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-64dc32",
  "org.scalablytyped" %%% "rc-field-form" % "1.8.0-65c5d3",
  "org.scalablytyped" %%% "rc-mentions" % "1.4.0-6c4e10",
  "org.scalablytyped" %%% "rc-menu" % "8.5.0-6d368b",
  "org.scalablytyped" %%% "rc-notification" % "4.4.0-f56b95",
  "org.scalablytyped" %%% "rc-picker" % "1.15.1-33e1c7",
  "org.scalablytyped" %%% "rc-select" % "11.1.0-cb3d80",
  "org.scalablytyped" %%% "rc-table" % "7.8.6-d9c4c0",
  "org.scalablytyped" %%% "rc-tabs" % "11.5.6-df0054",
  "org.scalablytyped" %%% "rc-textarea" % "0.3.0-3ac0c4",
  "org.scalablytyped" %%% "rc-tooltip" % "4.2.1-2b2b08",
  "org.scalablytyped" %%% "rc-tree" % "3.8.2-f66213",
  "org.scalablytyped" %%% "rc-tree-select" % "4.1.0-394209",
  "org.scalablytyped" %%% "rc-trigger" % "4.3.4-643eac",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200711Z-7368c8",
  "org.scalablytyped" %%% "react-router" % "5.1-dt-20200629Z-8a3ae0",
  "org.scalablytyped" %%% "scroll-into-view-if-needed" % "2.2.25-523b92",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
