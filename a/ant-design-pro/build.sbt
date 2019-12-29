organization := "org.scalablytyped"
name := "ant-design-pro"
version := "2.3.2-455f95"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ant-design__create-react-context" % "0.2.5-e994ca",
  "org.scalablytyped" %%% "antd" % "3.26.4-967eee",
  "org.scalablytyped" %%% "antv__g2" % "3.5.9-8259df",
  "org.scalablytyped" %%% "bizcharts" % "3.5.6-43507b",
  "org.scalablytyped" %%% "csstype" % "2.6.6-32adec",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20191126Z-3767e6",
  "org.scalablytyped" %%% "moment" % "2.24.0-8ebd48",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-bfe2c5",
  "org.scalablytyped" %%% "rc-mentions" % "0.4.2-ac4d5d",
  "org.scalablytyped" %%% "rc-menu" % "7.5.3-b3bcbe",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-73a5bc",
  "org.scalablytyped" %%% "react-router" % "5.1-dt-20191126Z-643832",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190503Z-819991",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        