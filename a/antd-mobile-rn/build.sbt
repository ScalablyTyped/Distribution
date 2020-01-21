organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-5a394a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-dcd929",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-78233f",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-8ef28f",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-0e1ae9",
  "org.scalablytyped" %%% "react-native" % "0.61-dt-20200117Z-abf5f4",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-3eebf4",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-c38da9",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-2e7e5d",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.10-f43158",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-0aac8f",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-75c4a3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        