organization := "org.scalablytyped"
name := "ant-design__react-native"
version := "3.3.0-806bd7"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-3726c2",
  "org.scalablytyped" %%% "csstype" % "2.6.9-7dae47",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-034048",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200624Z-23874e",
  "org.scalablytyped" %%% "react-native" % "0.62-dt-20200626Z-a59915",
  "org.scalablytyped" %%% "react-native-collapsible" % "1.5.2-2e0595",
  "org.scalablytyped" %%% "react-native-community__viewpager" % "1.1.7-106aa1",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-22d7e8",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-e6b1d7",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
