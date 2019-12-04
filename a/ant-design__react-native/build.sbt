organization := "org.scalablytyped"
name := "ant-design__react-native"
version := "3.2.0-8e8bae"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-d53d6c",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191126Z-3d1d47",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191121Z-cb9adb",
  "org.scalablytyped" %%% "react-native-collapsible" % "1.5.1-443379",
  "org.scalablytyped" %%% "react-native-community__viewpager" % "1.1.7-411120",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-6f5ff0",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-1a101c",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        