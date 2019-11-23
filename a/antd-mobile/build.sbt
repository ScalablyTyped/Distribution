organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.3.1-88b68e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-3eaa6f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-8b44d5",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-eefbf9",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191122Z-caf4d8",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-be46e7",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-17f4b4",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-dce699",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-8c5339",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-baa7f8",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        