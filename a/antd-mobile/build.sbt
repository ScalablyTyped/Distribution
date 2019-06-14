organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.2.14-feb250"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-3bfbc5",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-4b3bf2",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-1101a0",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190613Z-62c565",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-30a277",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-6cd4ea",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-b7a045",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-1f9dbd",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-6d32f8",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        