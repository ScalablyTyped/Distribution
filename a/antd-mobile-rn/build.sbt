organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-b9ad44"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c945ed",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-864aac",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-55594c",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190705Z-45b073",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-d7c5ff",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-b443f9",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-8cbb9a",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        