organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.2.14-cf7498"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-e47d18",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-2a42a7",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-240b8c",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190621Z-8d8143",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-0f0d1f",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-e4a737",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-dea0e6",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-38f510",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-dde3a4",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        