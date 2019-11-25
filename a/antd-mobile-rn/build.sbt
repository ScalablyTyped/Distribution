organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-ebd18f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-5be376",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191123Z-d1d56f",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191121Z-a0fb20",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-0d5091",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-fce1f0",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-e42f17",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-cfc9b2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        