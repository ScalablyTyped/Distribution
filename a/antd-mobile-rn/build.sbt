organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-ad8a9d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-e47d18",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-2a42a7",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-38d88c",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190619Z-8d8143",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190613Z-27d7d1",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-1e97e1",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-e33753",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-441047",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        