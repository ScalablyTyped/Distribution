organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.2.13-62ded6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-225f24",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-ff94fb",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-1d18aa",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190508Z-56dde3",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-8e4b55",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-b63b68",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-3692a9",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-87ee83",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-01279e",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        