organization := "org.scalablytyped"
name := "antd"
version := "4.1.1-95327c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ant-design__icons" % "4.0.5-91d51e",
  "org.scalablytyped" %%% "ant-design__icons-svg" % "4.0.0-e7704f",
  "org.scalablytyped" %%% "ant-design__react-slick" % "0.25.5-e0dc91",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "dayjs" % "1.8.23-024d11",
  "org.scalablytyped" %%% "moment" % "2.24.0-b112e6",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "rc-field-form" % "1.1.3-d6231f",
  "org.scalablytyped" %%% "rc-mentions" % "1.0.1-0429c4",
  "org.scalablytyped" %%% "rc-menu" % "8.0.3-c5844e",
  "org.scalablytyped" %%% "rc-notification" % "4.0.0-c0affe",
  "org.scalablytyped" %%% "rc-picker" % "1.4.5-f65ee2",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20200226Z-4f0281",
  "org.scalablytyped" %%% "rc-table" % "7.4.4-00c907",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20190212Z-1efc65",
  "org.scalablytyped" %%% "rc-tree-select" % "3.1.2-b8292f",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200402Z-6f4338",
  "org.scalablytyped" %%% "scroll-into-view-if-needed" % "2.2.24-ab08e3",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
