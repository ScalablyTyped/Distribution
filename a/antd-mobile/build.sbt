organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.2.14-50bb54"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-7e82e4",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f48590",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-f5b25c",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190809Z-2d489e",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-5a242e",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-821b13",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-ea0fb4",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-029063",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-227d2f",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        