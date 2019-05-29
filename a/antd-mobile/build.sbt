organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.2.13-e48fc2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.4-a0e5c1",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-b94c72",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-41b3c1",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190528Z-1cea03",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-00de75",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-2215dc",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-b5d3e6",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-06dacb",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-4851da",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        