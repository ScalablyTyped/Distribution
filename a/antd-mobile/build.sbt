organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.3.1-24aa02"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-313239",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-11830c",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-c1b931",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200409Z-0bc722",
  "org.scalablytyped" %%% "react-native" % "0.62-dt-20200407Z-1131d6",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-641388",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-bfcd44",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-262066",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.10-bec6c9",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-79f7e0",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-7d5c39",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
