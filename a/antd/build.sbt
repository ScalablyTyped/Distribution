organization := "org.scalablytyped"
name := "antd"
version := "4.5.1-26c6d7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ant-design__icons" % "4.2.1-811f21",
  "org.scalablytyped" %%% "ant-design__icons-svg" % "4.1.0-92fd6e",
  "org.scalablytyped" %%% "ant-design__react-slick" % "0.27.0-03924f",
  "org.scalablytyped" %%% "csstype" % "3.0.2-b0fb5c",
  "org.scalablytyped" %%% "dayjs" % "1.8.31-c16e23",
  "org.scalablytyped" %%% "moment" % "2.27.0-b13ce0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-f69275",
  "org.scalablytyped" %%% "rc-field-form" % "1.8.0-5d6bb1",
  "org.scalablytyped" %%% "rc-mentions" % "1.4.0-fe291e",
  "org.scalablytyped" %%% "rc-menu" % "8.5.0-e2580e",
  "org.scalablytyped" %%% "rc-notification" % "4.4.0-869353",
  "org.scalablytyped" %%% "rc-picker" % "1.15.1-3b72c3",
  "org.scalablytyped" %%% "rc-select" % "11.1.0-090663",
  "org.scalablytyped" %%% "rc-table" % "7.8.6-436005",
  "org.scalablytyped" %%% "rc-tabs" % "11.5.6-b0a604",
  "org.scalablytyped" %%% "rc-textarea" % "0.3.0-512f58",
  "org.scalablytyped" %%% "rc-tooltip" % "4.2.1-cc4f6e",
  "org.scalablytyped" %%% "rc-tree" % "3.8.2-b00c27",
  "org.scalablytyped" %%% "rc-tree-select" % "4.1.0-b756f5",
  "org.scalablytyped" %%% "rc-trigger" % "4.3.4-c2bbb4",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200711Z-695c73",
  "org.scalablytyped" %%% "scroll-into-view-if-needed" % "2.2.25-d2d5b5",
  "org.scalablytyped" %%% "std" % "3.9-7c0472")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
