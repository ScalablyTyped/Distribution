organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.3.3-6fe5d2"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-7dae47",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-034048",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-6c2a9a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200624Z-23874e",
  "org.scalablytyped" %%% "react-native" % "0.62-dt-20200626Z-a59915",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-13f28a",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-735ff8",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-10c8c6",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.10-6b5df1",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.12-0c27e8",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-1156da",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
