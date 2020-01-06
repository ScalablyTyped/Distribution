organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.3.1-c7213a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-fd5644",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-b24434",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-581498",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-22d23f",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191230Z-16d6c0",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-38f01e",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-a41a51",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-1795e5",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.10-99c6d6",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-1cbdf5",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-1b82c1",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        