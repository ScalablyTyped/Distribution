organization := "org.scalablytyped"
name := "ant-design__react-native"
version := "3.2.0-50f1d9"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-efc8a8",
  "org.scalablytyped" %%% "csstype" % "2.6.6-1967d7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-e54803",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-cca292",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191004Z-c12942",
  "org.scalablytyped" %%% "react-native-community__viewpager" % "1.1.7-32cb4b",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-524ce9",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-b5884f",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-98dd5a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        