organization := "org.scalablytyped"
name := "ant-design__pro-layout"
version := "4.5.16-eec27e"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ant-design__create-react-context" % "0.2.4-57d038",
  "org.scalablytyped" %%% "antd" % "3.23.4-db676b",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190822Z-c13957",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190923Z-9fa94d",
  "org.scalablytyped" %%% "moment" % "2.24.0-4e4a5b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190903Z-bd378a",
  "org.scalablytyped" %%% "rc-mentions" % "0.4.0-4afb74",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190917Z-53b9fb",
  "org.scalablytyped" %%% "react-router" % "5.0-dt-20190918Z-0deff5",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190503Z-9ce37d",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        