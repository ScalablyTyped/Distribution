organization := "org.scalablytyped"
name := "ant-design-pro"
version := "2.3.2-ff03c8"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ant-design__create-react-context" % "0.2.5-4b0379",
  "org.scalablytyped" %%% "antd" % "3.26.7-9387a3",
  "org.scalablytyped" %%% "antv__g2" % "3.5.9-793f66",
  "org.scalablytyped" %%% "bizcharts" % "3.5.6-776143",
  "org.scalablytyped" %%% "csstype" % "2.6.6-dcd929",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200114Z-d16766",
  "org.scalablytyped" %%% "moment" % "2.24.0-73a0d6",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-78233f",
  "org.scalablytyped" %%% "rc-mentions" % "0.4.2-e4d644",
  "org.scalablytyped" %%% "rc-menu" % "7.5.4-1001c6",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-0e1ae9",
  "org.scalablytyped" %%% "react-router" % "5.1-dt-20200114Z-daf0e0",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190503Z-b12674",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        