organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.2.13-4fa403"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-225f24",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-ff94fb",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-8d95bd",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190520Z-43357b",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-062d97",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-a594ca",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-3068e6",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-2f30a8",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-e1d332",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        