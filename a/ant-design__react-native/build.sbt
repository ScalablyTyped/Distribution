organization := "org.scalablytyped"
name := "ant-design__react-native"
version := "3.2.2-0849ec"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-a75276",
  "org.scalablytyped" %%% "csstype" % "2.6.6-ffacbb",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-05a52c",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-b17eee",
  "org.scalablytyped" %%% "react-native" % "0.61-dt-20200214Z-8d1cb4",
  "org.scalablytyped" %%% "react-native-collapsible" % "1.5.1-b53165",
  "org.scalablytyped" %%% "react-native-community__viewpager" % "1.1.7-edfa0c",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-44a878",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-6bd040",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
