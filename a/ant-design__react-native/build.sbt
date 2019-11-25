organization := "org.scalablytyped"
name := "ant-design__react-native"
version := "3.2.0-dfc5b7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bang88__react-native-drawer-layout" % "2.0.3-27dcf1",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191123Z-d1d56f",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191121Z-a0fb20",
  "org.scalablytyped" %%% "react-native-community__viewpager" % "1.1.7-489a4b",
  "org.scalablytyped" %%% "react-native-modal-popover" % "0.0.12-9203c1",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-bf1598",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-cfc9b2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        