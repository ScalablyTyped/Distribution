organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-0a4816"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b4f267",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-7dc507",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-4161ad",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-9253ae",
  "org.scalablytyped" %%% "react-native" % "0.63-dt-20201120Z-b3b69c",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20200515Z-e2b68f",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-95c32c",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-a5d37c",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.10-d76ec0",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-60f363",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
