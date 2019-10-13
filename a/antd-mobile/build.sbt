organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.3.1-bda571"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-4ecea9",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-965e98",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-17951a",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-66a71c",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-74819c",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-1e8687",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-454205",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        