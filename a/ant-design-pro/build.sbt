organization := "org.scalablytyped"
name := "ant-design-pro"
version := "2.3.2-5073c8"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ant-design__create-react-context" % "0.2.5-8858dc",
  "org.scalablytyped" %%% "antd" % "3.26.9-1d167a",
  "org.scalablytyped" %%% "antv__g2" % "3.5.9-c1d7a2",
  "org.scalablytyped" %%% "bizcharts" % "3.5.6-083703",
  "org.scalablytyped" %%% "csstype" % "2.6.6-ffacbb",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200131Z-68f6ae",
  "org.scalablytyped" %%% "moment" % "2.24.0-8b2e89",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-05a52c",
  "org.scalablytyped" %%% "rc-mentions" % "0.4.2-14b852",
  "org.scalablytyped" %%% "rc-menu" % "7.5.5-b2b21e",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-b17eee",
  "org.scalablytyped" %%% "react-router" % "5.1-dt-20200212Z-032803",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190503Z-36d6f2",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
