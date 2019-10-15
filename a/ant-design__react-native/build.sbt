organization := "org.scalablytyped"
name := "ant-design__react-native"
version := "3.2.0-7f5e83"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-abfd37",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191014Z-d5b0ca",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191007Z-cc9d0b",
  "org.scalablytyped" %%% "react-native-community__viewpager" % "1.1.7-f44910",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-18a3f0",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-96f3a6",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-683415")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        