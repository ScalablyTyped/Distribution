organization := "org.scalablytyped"
name := "ant-design__react-native"
version := "3.3.0-60402f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-fdfd5f",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200320Z-629467",
  "org.scalablytyped" %%% "react-native" % "0.61-dt-20200318Z-8663a9",
  "org.scalablytyped" %%% "react-native-collapsible" % "1.5.1-1be1f9",
  "org.scalablytyped" %%% "react-native-community__viewpager" % "1.1.7-d746c8",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-086839",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-73d4b0",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
