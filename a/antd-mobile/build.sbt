organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.2.13-b7bb63"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.4-b274af",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-ff94fb",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-af8dc7",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190520Z-9d1c81",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-d3ae07",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-47e1c3",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-8f5b43",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-8117d6",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-b5de1b",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        