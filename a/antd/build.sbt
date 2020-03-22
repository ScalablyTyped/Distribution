organization := "org.scalablytyped"
name := "antd"
version := "4.0.0-3c4268"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ant-design__icons" % "4.0.2-550500",
  "org.scalablytyped" %%% "ant-design__icons-svg" % "4.0.0-e7704f",
  "org.scalablytyped" %%% "ant-design__react-slick" % "0.25.5-fb2ab6",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "dayjs" % "1.8.21-2be061",
  "org.scalablytyped" %%% "moment" % "2.24.0-b112e6",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "rc-field-form" % "1.0.1-b8f3bd",
  "org.scalablytyped" %%% "rc-mentions" % "1.0.1-dcf9ec",
  "org.scalablytyped" %%% "rc-menu" % "8.0.2-d7323c",
  "org.scalablytyped" %%% "rc-notification" % "4.0.0-e8e127",
  "org.scalablytyped" %%% "rc-picker" % "1.1.2-088ead",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20190322Z-3e30ca",
  "org.scalablytyped" %%% "rc-table" % "7.0.0-bb55af",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20190212Z-d9f0e8",
  "org.scalablytyped" %%% "rc-tree-select" % "3.0.2-15841d",
  "org.scalablytyped" %%% "rc-trigger" % "4.0.0-ef4fd6",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-fc5268",
  "org.scalablytyped" %%% "scroll-into-view-if-needed" % "2.2.24-ab08e3",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
