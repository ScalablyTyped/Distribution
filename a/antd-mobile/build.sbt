organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.2.14-9092ed"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-7e82e4",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f48590",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-4efddf",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-ce0842",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-b98597",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-2f923e",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-97cc1b",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-0a35a4",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-38237d",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        