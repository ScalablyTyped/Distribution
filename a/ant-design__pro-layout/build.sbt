organization := "org.scalablytyped"
name := "ant-design__pro-layout"
version := "4.8.1-db929d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ant-design__create-react-context" % "0.2.4-771b3c",
  "org.scalablytyped" %%% "antd" % "3.25.3-ce5222",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190822Z-4ceb2f",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191118Z-536bad",
  "org.scalablytyped" %%% "moment" % "2.24.0-534f7e",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "rc-mentions" % "0.4.1-286037",
  "org.scalablytyped" %%% "rc-menu" % "7.5.3-510e19",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191123Z-d1d56f",
  "org.scalablytyped" %%% "react-router" % "5.1-dt-20191113Z-133303",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190503Z-375117",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        