organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.2.14-16c2f3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-7e82e4",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f48590",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-85c6ff",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190731Z-e8f22e",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-ece79b",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-57b29a",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-22fc28",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-b91653",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-9b0425",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        