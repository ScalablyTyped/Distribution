organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.3.1-6564e2"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-fd4af0",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-d50dca",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-6dcbc8",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-6d284b",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-3cca65",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-a79a76",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-6f6376",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-2a84ca",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        