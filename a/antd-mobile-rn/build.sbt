organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-831fcd"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-f2aed9",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200402Z-6f4338",
  "org.scalablytyped" %%% "react-native" % "0.62-dt-20200407Z-401c8f",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-88aeaf",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-d9146f",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-af5070",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.10-11a3c5",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-4f3390",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
