organization := "org.scalablytyped"
name := "ant-design-pro"
version := "2.3.2-e4d7e6"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ant-design__icons" % "4.0.3-a899a0",
  "org.scalablytyped" %%% "ant-design__icons-svg" % "4.0.0-e7704f",
  "org.scalablytyped" %%% "ant-design__react-slick" % "0.25.5-2d5788",
  "org.scalablytyped" %%% "antd" % "4.0.3-2f8da5",
  "org.scalablytyped" %%% "antv__g2" % "3.5.11-14d814",
  "org.scalablytyped" %%% "bizcharts" % "3.5.7-d5911a",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "dayjs" % "1.8.23-024d11",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200226Z-b605ef",
  "org.scalablytyped" %%% "moment" % "2.24.0-b112e6",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "rc-field-form" % "1.0.1-e4620c",
  "org.scalablytyped" %%% "rc-mentions" % "1.0.1-3d8c57",
  "org.scalablytyped" %%% "rc-menu" % "8.0.2-62c6cb",
  "org.scalablytyped" %%% "rc-notification" % "4.0.0-29894c",
  "org.scalablytyped" %%% "rc-picker" % "1.1.5-0485c9",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20200226Z-d248be",
  "org.scalablytyped" %%% "rc-table" % "7.3.8-996b83",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20190212Z-04707b",
  "org.scalablytyped" %%% "rc-tree-select" % "3.0.4-b9faea",
  "org.scalablytyped" %%% "rc-trigger" % "4.0.2-0e2269",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200320Z-629467",
  "org.scalablytyped" %%% "react-router" % "5.1-dt-20200227Z-1e5bf7",
  "org.scalablytyped" %%% "scroll-into-view-if-needed" % "2.2.24-ab08e3",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
