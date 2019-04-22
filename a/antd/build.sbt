organization := "org.scalablytyped"
name := "antd"
version := "3.16.4-e0e22f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "ant-design__create-react-context" % "0.2.4-6047d3",
  "org.scalablytyped" %%% "csstype" % "2.6.3-61d3d0",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-446320",
  "org.scalablytyped" %%% "moment" % "2.24.0-06383d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-7e744c",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190419Z-caf3c8",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190126Z-765d97",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        