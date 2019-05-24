organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-ade6da"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.4-b274af",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-ff94fb",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-af8dc7",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190520Z-9d1c81",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190522Z-50d600",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-bd1ad1",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-47e1c3",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-b5de1b",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        