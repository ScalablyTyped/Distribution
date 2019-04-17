organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-6973c8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-61d3d0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-7e744c",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-66c216",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-5f45a9",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190416Z-d088dc",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-5c0abd",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-5423fd",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-0ae3d9",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        