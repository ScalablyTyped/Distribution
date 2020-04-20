organization := "org.scalablytyped"
name := "antd"
version := "4.1.4-2cb14a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ant-design__icons" % "4.0.6-2bb559",
  "org.scalablytyped" %%% "ant-design__icons-svg" % "4.0.0-35b35f",
  "org.scalablytyped" %%% "ant-design__react-slick" % "0.25.5-bb5088",
  "org.scalablytyped" %%% "csstype" % "2.6.9-313239",
  "org.scalablytyped" %%% "dayjs" % "1.8.23-f3bbfb",
  "org.scalablytyped" %%% "moment" % "2.24.0-677241",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-11830c",
  "org.scalablytyped" %%% "rc-field-form" % "1.1.3-43a2f4",
  "org.scalablytyped" %%% "rc-mentions" % "1.1.0-65dbb5",
  "org.scalablytyped" %%% "rc-menu" % "8.0.3-c9dd29",
  "org.scalablytyped" %%% "rc-notification" % "4.0.0-50e50a",
  "org.scalablytyped" %%% "rc-picker" % "1.4.8-fcd618",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20200226Z-f54476",
  "org.scalablytyped" %%% "rc-table" % "7.4.5-adccb0",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20190212Z-2ed073",
  "org.scalablytyped" %%% "rc-tree-select" % "3.1.3-5b10c0",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200409Z-0bc722",
  "org.scalablytyped" %%% "scroll-into-view-if-needed" % "2.2.24-252d63",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
