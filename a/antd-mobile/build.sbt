organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.2.12-e30015"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-61d3d0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-7e744c",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-9ea579",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190419Z-caf3c8",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-0524e6",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-f21abc",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-d978d7",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-655cc1",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-f02309",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        