organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.3.1-3bfcb1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-3eaa6f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-8b44d5",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-bce641",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191025Z-132fef",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-2113df",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-b3cec2",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-cac6ee",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-e9cc10",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-e7d8e8",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        