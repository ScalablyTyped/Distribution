organization := "org.scalablytyped"
name := "ant-design__react-native"
version := "3.2.0-45c11b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-275eef",
  "org.scalablytyped" %%% "csstype" % "2.6.6-3eaa6f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-8b44d5",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191122Z-caf4d8",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191121Z-89fb36",
  "org.scalablytyped" %%% "react-native-community__viewpager" % "1.1.7-db9957",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-0bbfc8",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-7bd4e1",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-c8013d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        