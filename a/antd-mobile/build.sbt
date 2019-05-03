organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.2.13-8f1eed"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-225f24",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-66be5f",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-6bb7c1",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190429Z-19278e",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-5f7f77",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-9b6edf",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-8e0461",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-b2e157",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-26ea7f",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        