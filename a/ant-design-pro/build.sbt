organization := "org.scalablytyped"
name := "ant-design-pro"
version := "2.3.2-3d4130"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ant-design__icons" % "4.1.0-c1b246",
  "org.scalablytyped" %%% "ant-design__icons-svg" % "4.0.0-bc7b5a",
  "org.scalablytyped" %%% "ant-design__react-slick" % "0.26.1-fe19aa",
  "org.scalablytyped" %%% "antd" % "4.2.4-ad9200",
  "org.scalablytyped" %%% "antv__g2" % "3.5.11-d9aac2",
  "org.scalablytyped" %%% "bizcharts" % "3.5.7-d1376e",
  "org.scalablytyped" %%% "csstype" % "2.6.9-03f85a",
  "org.scalablytyped" %%% "dayjs" % "1.8.27-347c2c",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200518Z-48aa64",
  "org.scalablytyped" %%% "moment" % "2.26.0-76666d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-4fb81d",
  "org.scalablytyped" %%% "rc-field-form" % "1.2.4-ac2bbc",
  "org.scalablytyped" %%% "rc-mentions" % "1.1.0-514c79",
  "org.scalablytyped" %%% "rc-menu" % "8.1.0-af21a1",
  "org.scalablytyped" %%% "rc-notification" % "4.3.2-abc398",
  "org.scalablytyped" %%% "rc-picker" % "1.4.16-524957",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20200515Z-9d7397",
  "org.scalablytyped" %%% "rc-table" % "7.5.10-7dc963",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20200515Z-de3283",
  "org.scalablytyped" %%% "rc-tree-select" % "3.1.3-ffe782",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200515Z-0f8114",
  "org.scalablytyped" %%% "react-router" % "5.1-dt-20200515Z-de425a",
  "org.scalablytyped" %%% "scroll-into-view-if-needed" % "2.2.24-d037e1",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
