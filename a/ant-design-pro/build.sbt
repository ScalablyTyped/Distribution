organization := "org.scalablytyped"
name := "ant-design-pro"
version := "2.3.2-1fa62a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ant-design__create-react-context" % "0.2.5-ce13bd",
  "org.scalablytyped" %%% "antd" % "3.26.6-51a600",
  "org.scalablytyped" %%% "antv__g2" % "3.5.9-21fda9",
  "org.scalablytyped" %%% "bizcharts" % "3.5.6-152bc1",
  "org.scalablytyped" %%% "csstype" % "2.6.6-fd5644",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20191126Z-cd311f",
  "org.scalablytyped" %%% "moment" % "2.24.0-d25a29",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-b24434",
  "org.scalablytyped" %%% "rc-mentions" % "0.4.2-7ea273",
  "org.scalablytyped" %%% "rc-menu" % "7.5.3-ea4334",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-22d23f",
  "org.scalablytyped" %%% "react-router" % "5.1-dt-20191126Z-dc9282",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190503Z-462bed",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        