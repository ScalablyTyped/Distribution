organization := "org.scalablytyped"
name := "antd"
version := "4.8.5-ac8be0"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "ant-design__icons" % "4.3.0-55e762",
  "org.scalablytyped" %%% "ant-design__icons-svg" % "4.1.0-946c15",
  "org.scalablytyped" %%% "ant-design__react-slick" % "0.27.14-fd49d4",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b4f267",
  "org.scalablytyped" %%% "dayjs" % "1.9.6-90e25f",
  "org.scalablytyped" %%% "moment" % "2.29.1-0456e1",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-7dc507",
  "org.scalablytyped" %%% "rc-dialog" % "8.4.3-9b3bed",
  "org.scalablytyped" %%% "rc-field-form" % "1.17.2-cbd0c4",
  "org.scalablytyped" %%% "rc-image" % "4.0.1-0a4598",
  "org.scalablytyped" %%% "rc-mentions" % "1.5.2-c702f4",
  "org.scalablytyped" %%% "rc-menu" % "8.10.0-d05791",
  "org.scalablytyped" %%% "rc-motion" % "2.4.1-2ad5b5",
  "org.scalablytyped" %%% "rc-notification" % "4.5.4-11f38c",
  "org.scalablytyped" %%% "rc-picker" % "2.4.1-61c03c",
  "org.scalablytyped" %%% "rc-select" % "11.4.2-44cc4e",
  "org.scalablytyped" %%% "rc-table" % "7.11.2-2e52e1",
  "org.scalablytyped" %%% "rc-tabs" % "11.7.1-af903f",
  "org.scalablytyped" %%% "rc-textarea" % "0.3.1-c28b21",
  "org.scalablytyped" %%% "rc-tooltip" % "5.0.1-46c190",
  "org.scalablytyped" %%% "rc-tree" % "3.11.0-6ea414",
  "org.scalablytyped" %%% "rc-tree-select" % "4.1.3-6131eb",
  "org.scalablytyped" %%% "rc-trigger" % "5.1.2-5ac246",
  "org.scalablytyped" %%% "rc-util" % "5.5.0-838101",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-9253ae",
  "org.scalablytyped" %%% "scroll-into-view-if-needed" % "2.2.26-3d6521",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
