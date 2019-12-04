organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-cbd012"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-219588",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191126Z-3d1d47",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191121Z-cb9adb",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-548c7c",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-186a9a",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-7c8e90",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.10-9bd9a7",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-05e917",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-8826e3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        