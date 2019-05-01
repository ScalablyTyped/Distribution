organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.2.13-f49454"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-908b0a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-e0e6aa",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-5f822f",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190429Z-aae4f0",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-fa8b6b",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-f9cc4f",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-ee0123",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-2f7401",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-90bf8b",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        