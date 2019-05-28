organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.2.13-2dbda4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.4-b274af",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-ff94fb",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-a76c33",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190520Z-336e99",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-c27e16",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-581114",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-aa6750",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-cb2e7a",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-ce897a",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        