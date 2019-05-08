organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.2.13-71c61f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-225f24",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-66be5f",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-f5e60c",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190508Z-c1645f",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-0d66af",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-617b80",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-df1a48",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-5d16fd",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-358f45",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        