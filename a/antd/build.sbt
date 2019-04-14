organization := "org.scalablytyped"
name := "antd"
version := "3.16.3-4c4afc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-36e2b7",
  "org.scalablytyped" %%% "csstype" % "2.6.3-61d3d0",
  "org.scalablytyped" %%% "moment" % "2.24.0-06383d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-7e744c",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-5f45a9",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190126Z-da0ce4",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        