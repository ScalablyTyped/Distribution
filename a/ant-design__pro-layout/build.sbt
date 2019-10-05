organization := "org.scalablytyped"
name := "ant-design__pro-layout"
version := "4.5.16-112c1f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ant-design__create-react-context" % "0.2.4-26425a",
  "org.scalablytyped" %%% "antd" % "3.23.5-c65177",
  "org.scalablytyped" %%% "csstype" % "2.6.6-1967d7",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190822Z-629ec7",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190927Z-e779dd",
  "org.scalablytyped" %%% "moment" % "2.24.0-376d78",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-e54803",
  "org.scalablytyped" %%% "rc-mentions" % "0.4.0-a22c02",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-cca292",
  "org.scalablytyped" %%% "react-router" % "5.1-dt-20190930Z-2ca4f6",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190503Z-ad904b",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        