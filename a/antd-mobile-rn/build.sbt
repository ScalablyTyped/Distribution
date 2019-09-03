organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-7e1e2a"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-fd4af0",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-d50dca",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-6dcbc8",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190902Z-b1ede5",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-ccf637",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-3cca65",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-2a84ca",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-02a4ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        