organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-8c6f1f"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c240ab",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-666320",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-847c1a",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190823Z-786e7e",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-c673ee",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-38d800",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-041f35",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-b3947d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        