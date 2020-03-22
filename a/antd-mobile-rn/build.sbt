organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-929a79"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-b7ba55",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200320Z-629467",
  "org.scalablytyped" %%% "react-native" % "0.61-dt-20200318Z-8663a9",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-4aa3c9",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-055b89",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-39a604",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.10-4f0a6d",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-90c1d8",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
