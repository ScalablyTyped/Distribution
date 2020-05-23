organization := "org.scalablytyped"
name := "ant-design__react-native"
version := "3.3.0-5d5507"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-51212c",
  "org.scalablytyped" %%% "csstype" % "2.6.9-03f85a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-4fb81d",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200515Z-0f8114",
  "org.scalablytyped" %%% "react-native" % "0.62-dt-20200515Z-139570",
  "org.scalablytyped" %%% "react-native-collapsible" % "1.5.2-c6f890",
  "org.scalablytyped" %%% "react-native-community__viewpager" % "1.1.7-b472c1",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-ae6121",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-e8f56e",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
