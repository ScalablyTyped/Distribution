organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.3.1-02c540"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-71ac8e",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191016Z-462cf8",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-d7d73b",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-acc8ce",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-66dca6",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-e1f5d5",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-1ede2d",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        