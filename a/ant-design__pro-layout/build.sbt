organization := "org.scalablytyped"
name := "ant-design__pro-layout"
version := "4.6.2-711a60"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ant-design__create-react-context" % "0.2.4-3d3062",
  "org.scalablytyped" %%% "antd" % "3.25.0-13f2d4",
  "org.scalablytyped" %%% "csstype" % "2.6.6-3eaa6f",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190822Z-815dc4",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191108Z-c322f2",
  "org.scalablytyped" %%% "moment" % "2.24.0-122f60",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-8b44d5",
  "org.scalablytyped" %%% "rc-mentions" % "0.4.1-bbce39",
  "org.scalablytyped" %%% "rc-menu" % "7.5.3-791afa",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191025Z-132fef",
  "org.scalablytyped" %%% "react-router" % "5.1-dt-20191014Z-3a4233",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190503Z-bf0a85",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        