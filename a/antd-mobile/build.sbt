organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.2.13-ac30d1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-225f24",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-66be5f",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-2194e3",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190508Z-a9badf",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-d26121",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-7ed7ba",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-f938c3",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-9b97f7",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-141a24",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        