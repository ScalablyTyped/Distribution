organization := "org.scalablytyped"
name := "ant-design__react-native"
version := "4.0.6-0e2677"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-7d82ce",
  "org.scalablytyped" %%% "csstype" % "2.6.14-fa358f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-0012d8",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-cfb347",
  "org.scalablytyped" %%% "react-native" % "0.63-dt-20201120Z-d8889c",
  "org.scalablytyped" %%% "react-native-collapsible" % "1.5.3-5b37b2",
  "org.scalablytyped" %%% "react-native-community__picker" % "1.8.1-a3eab8",
  "org.scalablytyped" %%% "react-native-community__viewpager" % "4.2.0-b3a4b1",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-c9a27d",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-072c98",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
