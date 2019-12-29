organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.3.1-a63075"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-32adec",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-bfe2c5",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-bce8f6",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-73a5bc",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191223Z-967814",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-2c19e5",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-b5e44d",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-e19eea",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.10-1c42f0",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-8af817",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-d70dd3",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        