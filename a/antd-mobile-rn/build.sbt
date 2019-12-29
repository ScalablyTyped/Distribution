organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-5c056a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-32adec",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-bfe2c5",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-bce8f6",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-73a5bc",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191223Z-967814",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-f6e72e",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-b5e44d",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-e19eea",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.10-1c42f0",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-d70dd3",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-cdffde")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        