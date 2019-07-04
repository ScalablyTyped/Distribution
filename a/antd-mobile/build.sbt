organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.2.14-c15a22"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-e47d18",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-2a42a7",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-881105",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-97e7d2",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-d9898e",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-bddfd0",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-327c51",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-03244b",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-30154d",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        