organization := "org.scalablytyped"
name := "ant-design__react-native"
version := "3.2.0-b8a0d9"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-06e5af",
  "org.scalablytyped" %%% "csstype" % "2.6.6-32adec",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-bfe2c5",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-73a5bc",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191223Z-967814",
  "org.scalablytyped" %%% "react-native-collapsible" % "1.5.1-54d733",
  "org.scalablytyped" %%% "react-native-community__viewpager" % "1.1.7-e9a204",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-f33ce1",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-78141e",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        