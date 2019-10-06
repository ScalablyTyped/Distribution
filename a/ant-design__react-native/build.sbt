organization := "org.scalablytyped"
name := "ant-design__react-native"
version := "3.2.0-14b6c8"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-282b02",
  "org.scalablytyped" %%% "csstype" % "2.6.6-1967d7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-e54803",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-3b437f",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191004Z-d20812",
  "org.scalablytyped" %%% "react-native-community__viewpager" % "1.1.7-b6d8fe",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-42a399",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-d3d936",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-98dd5a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        