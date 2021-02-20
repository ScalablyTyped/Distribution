organization := "org.scalablytyped"
name := "ant-design__react-native"
version := "4.0.6-4554aa"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-fa6ff6",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b4f267",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-7dc507",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-9253ae",
  "org.scalablytyped" %%% "react-native" % "0.63-dt-20201120Z-b3b69c",
  "org.scalablytyped" %%% "react-native-collapsible" % "1.5.3-068780",
  "org.scalablytyped" %%% "react-native-community__picker" % "1.8.1-e1a37b",
  "org.scalablytyped" %%% "react-native-community__viewpager" % "4.2.0-047ccb",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-40ed03",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-80d8bb",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
