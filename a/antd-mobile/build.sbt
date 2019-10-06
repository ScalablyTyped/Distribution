organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.3.1-ecf90f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-1967d7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-e54803",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-e87203",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-3b437f",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-2e32ac",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-08e8bf",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-c5d3ec",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-c4d255",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-5b8cc5",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        