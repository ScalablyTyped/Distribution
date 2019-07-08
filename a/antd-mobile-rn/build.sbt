organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-55f802"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-523284",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-24a9c0",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-5fe923",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190705Z-39a76d",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-76d097",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-870d56",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-8b6c17",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        