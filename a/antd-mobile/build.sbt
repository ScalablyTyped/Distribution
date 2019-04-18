organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.2.11-acd9ac"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-61d3d0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-7e744c",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-79d939",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-26e47b",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-2ce192",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-c3c507",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-eeb4e8",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-7ea816",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-4b4b29",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        