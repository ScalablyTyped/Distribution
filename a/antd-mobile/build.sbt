organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.3.1-b8d956"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-06c3ac",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-259d7c",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-b3917f",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-7fb07a",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-3a483f",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-a0c8a6",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-d330e2",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-0fe1e5",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        