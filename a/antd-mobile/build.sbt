organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.3.1-74b64c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-a6f1df",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-fc5268",
  "org.scalablytyped" %%% "react-native" % "0.61-dt-20200214Z-9c1107",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-99ba22",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-5b0e37",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-4d3b84",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.10-85b622",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-45b2d1",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-5122e7",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
