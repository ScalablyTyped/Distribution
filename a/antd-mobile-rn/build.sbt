organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-fff17a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-727386",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191025Z-9e835e",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191015Z-4f281b",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-9466ba",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-0cbcdb",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-43a426",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-683415")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        