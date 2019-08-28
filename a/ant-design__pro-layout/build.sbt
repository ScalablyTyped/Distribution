organization := "org.scalablytyped"
name := "ant-design__pro-layout"
version := "4.5.14-e7f2df"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ant-design__create-react-context" % "0.2.4-a97aae",
  "org.scalablytyped" %%% "antd" % "3.22.2-fbd038",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c240ab",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190822Z-3f670d",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190827Z-cbbb3c",
  "org.scalablytyped" %%% "moment" % "2.24.0-92164a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "rc-mentions" % "0.4.0-682406",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-847c1a",
  "org.scalablytyped" %%% "react-router" % "5.0-dt-20190702Z-59bc8e",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190503Z-d4ddf0",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        