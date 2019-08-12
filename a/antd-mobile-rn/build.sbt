organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-54ed81"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-7e82e4",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f48590",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-f5b25c",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190809Z-2d489e",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190811Z-fb28ff",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-58d3b4",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-821b13",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-227d2f",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        