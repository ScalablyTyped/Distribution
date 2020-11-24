organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.3.4-807a75"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.14-fa358f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-0012d8",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-113815",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-cfb347",
  "org.scalablytyped" %%% "react-native" % "0.63-dt-20201120Z-d8889c",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-090544",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-9252e7",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-a60c89",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.10-ddf3e6",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.13-3190d6",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-234dfd",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
