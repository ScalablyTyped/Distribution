organization := "org.scalablytyped"
name := "ant-design__pro-utils"
version := "1.2.0-2912eb"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ant-design__icons" % "4.3.0-f24b3a",
  "org.scalablytyped" %%% "ant-design__icons-svg" % "4.1.0-c395eb",
  "org.scalablytyped" %%% "ant-design__react-slick" % "0.27.14-3ac366",
  "org.scalablytyped" %%% "antd" % "4.8.5-33a4a9",
  "org.scalablytyped" %%% "csstype" % "2.6.14-fa358f",
  "org.scalablytyped" %%% "dayjs" % "1.9.6-1e410f",
  "org.scalablytyped" %%% "moment" % "2.29.1-01272f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-0012d8",
  "org.scalablytyped" %%% "rc-dialog" % "8.4.3-2f76dc",
  "org.scalablytyped" %%% "rc-field-form" % "1.17.2-dec220",
  "org.scalablytyped" %%% "rc-image" % "4.0.1-d5edfd",
  "org.scalablytyped" %%% "rc-mentions" % "1.5.2-d88efe",
  "org.scalablytyped" %%% "rc-menu" % "8.10.0-381fff",
  "org.scalablytyped" %%% "rc-motion" % "2.4.1-620b0b",
  "org.scalablytyped" %%% "rc-notification" % "4.5.4-d4a8dd",
  "org.scalablytyped" %%% "rc-picker" % "2.4.1-e1d152",
  "org.scalablytyped" %%% "rc-select" % "11.4.2-eddd3e",
  "org.scalablytyped" %%% "rc-table" % "7.11.2-800e24",
  "org.scalablytyped" %%% "rc-tabs" % "11.7.1-603b61",
  "org.scalablytyped" %%% "rc-textarea" % "0.3.1-58c759",
  "org.scalablytyped" %%% "rc-tooltip" % "5.0.1-22a9c8",
  "org.scalablytyped" %%% "rc-tree" % "3.11.0-a7cdc7",
  "org.scalablytyped" %%% "rc-tree-select" % "4.1.3-db7041",
  "org.scalablytyped" %%% "rc-trigger" % "5.1.2-46c799",
  "org.scalablytyped" %%% "rc-util" % "5.5.0-a4d307",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-cfb347",
  "org.scalablytyped" %%% "scroll-into-view-if-needed" % "2.2.26-61c706",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
