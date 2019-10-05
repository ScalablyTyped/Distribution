organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-53edb0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-1967d7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-e54803",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-dc8912",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-cca292",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191004Z-c12942",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-7c6f91",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-0842df",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-8842e9",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-98dd5a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        