organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.3.1-410fbf"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-0eb367",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191209Z-f85fa6",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191210Z-aec922",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-fc7662",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-8af5c5",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-89124a",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.10-8f0c8b",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-33deb0",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-cd991b",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        