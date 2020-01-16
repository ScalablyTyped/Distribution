organization := "org.scalablytyped"
name := "ant-design__react-native"
version := "3.2.2-65f67b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-8cdb05",
  "org.scalablytyped" %%% "csstype" % "2.6.6-fd5644",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-b24434",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-22d23f",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20200116Z-c53518",
  "org.scalablytyped" %%% "react-native-collapsible" % "1.5.1-82d743",
  "org.scalablytyped" %%% "react-native-community__viewpager" % "1.1.7-18bec3",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-f4fde1",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-d77d01",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        