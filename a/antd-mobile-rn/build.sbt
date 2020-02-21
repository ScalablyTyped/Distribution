organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-342b76"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-ffacbb",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-05a52c",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-281658",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-b17eee",
  "org.scalablytyped" %%% "react-native" % "0.61-dt-20200214Z-8d1cb4",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-733ef1",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-494319",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-d5cd91",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.10-85e84f",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-995ab5",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-02b66e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
