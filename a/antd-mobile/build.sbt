organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.3.1-05173e"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190903Z-bd378a",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-0fb651",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190917Z-53b9fb",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-7d5b3d",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-76aec1",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-47f047",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-562204",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-6a4001",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        