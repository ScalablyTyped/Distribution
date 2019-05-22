organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-f4d1a1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-225f24",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-ff94fb",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-8d95bd",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190520Z-43357b",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190519Z-32ec59",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-f615ce",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-a594ca",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-e1d332",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        