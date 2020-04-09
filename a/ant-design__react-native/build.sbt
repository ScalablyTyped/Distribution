organization := "org.scalablytyped"
name := "ant-design__react-native"
version := "3.3.0-5535bc"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-f7af65",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200402Z-6f4338",
  "org.scalablytyped" %%% "react-native" % "0.62-dt-20200407Z-401c8f",
  "org.scalablytyped" %%% "react-native-collapsible" % "1.5.2-18bcaa",
  "org.scalablytyped" %%% "react-native-community__viewpager" % "1.1.7-44634d",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-87d8e3",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-924bdd",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
