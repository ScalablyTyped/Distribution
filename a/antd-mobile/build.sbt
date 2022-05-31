organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.3.4-e3d366"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-dc2f99",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-3fbed9",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-75d1a0",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-4ff700",
  "org.scalablytyped" %%% "react-native" % "0.63-dt-20201120Z-0cfe87",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-c304ae",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-8fa1fc",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-c0d242",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.10-668fe5",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.13-539c53",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-2f76b2",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
