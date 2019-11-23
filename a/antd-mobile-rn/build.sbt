organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-642a40"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-3eaa6f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-8b44d5",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-eefbf9",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191122Z-caf4d8",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191121Z-89fb36",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-9d67d6",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-17f4b4",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-baa7f8",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-c8013d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        