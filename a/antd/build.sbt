organization := "org.scalablytyped"
name := "antd"
version := "4.4.0-c24d06"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ant-design__icons" % "4.2.1-7ec7d0",
  "org.scalablytyped" %%% "ant-design__icons-svg" % "4.1.0-f5b344",
  "org.scalablytyped" %%% "ant-design__react-slick" % "0.26.2-9a413a",
  "org.scalablytyped" %%% "csstype" % "2.6.9-7dae47",
  "org.scalablytyped" %%% "dayjs" % "1.8.28-38937a",
  "org.scalablytyped" %%% "moment" % "2.27.0-da83b2",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-034048",
  "org.scalablytyped" %%% "rc-field-form" % "1.5.0-d39363",
  "org.scalablytyped" %%% "rc-mentions" % "1.3.0-6198de",
  "org.scalablytyped" %%% "rc-menu" % "8.3.1-958f78",
  "org.scalablytyped" %%% "rc-notification" % "4.4.0-2a0365",
  "org.scalablytyped" %%% "rc-picker" % "1.10.3-af5997",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20200515Z-1ae5ac",
  "org.scalablytyped" %%% "rc-table" % "7.8.1-b25bd7",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20200515Z-733297",
  "org.scalablytyped" %%% "rc-tree-select" % "4.0.2-87663b",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200624Z-23874e",
  "org.scalablytyped" %%% "scroll-into-view-if-needed" % "2.2.25-f6b7de",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
