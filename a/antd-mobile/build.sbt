organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.2.13-b66013"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-8a2cd0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c843c9",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-2e3da7",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190528Z-1fde1d",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-145add",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-20a89e",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-57928d",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-4449b3",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-90c153",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        