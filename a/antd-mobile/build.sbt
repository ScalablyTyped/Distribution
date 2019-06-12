organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.2.13-0c9047"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-3bfbc5",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-4b3bf2",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-622079",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190528Z-62c565",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-3d4e9e",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-caaf75",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-9b96f0",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-2c8fb8",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-289b03",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        