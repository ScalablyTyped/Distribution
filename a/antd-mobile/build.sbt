organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.2.14-7d4a94"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-523284",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-24a9c0",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-5fe923",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-a02b70",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-870d56",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-2cc385",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-e6746e",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-8b6c17",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        