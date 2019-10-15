organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.3.1-9a2fa3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-bb155f",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191014Z-d5b0ca",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-aae892",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-7658f2",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-7895b9",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-55a113",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-293a6e",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        