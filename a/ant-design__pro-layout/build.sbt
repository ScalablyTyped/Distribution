organization := "org.scalablytyped"
name := "ant-design__pro-layout"
version := "4.9.8-9fae62"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ant-design__create-react-context" % "0.2.4-eb75f7",
  "org.scalablytyped" %%% "antd" % "3.26.2-e5c521",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20191126Z-4ceb2f",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191126Z-536bad",
  "org.scalablytyped" %%% "moment" % "2.24.0-534f7e",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "rc-mentions" % "0.4.1-f09ad5",
  "org.scalablytyped" %%% "rc-menu" % "7.5.3-03a76a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191209Z-f85fa6",
  "org.scalablytyped" %%% "react-router" % "5.1-dt-20191126Z-355d49",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190503Z-2df81b",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        