organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.2.14-d7971e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c945ed",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-864aac",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-55594c",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-a3cd6a",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-b443f9",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-12c85f",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-929445",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-8cbb9a",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        