organization := "org.scalablytyped"
name := "antd"
version := "4.24.2-24e763"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ant-design__icons" % "4.7.0-89de04",
  "org.scalablytyped" %%% "ant-design__icons-svg" % "4.2.1-b90a28",
  "org.scalablytyped" %%% "ant-design__react-slick" % "0.29.2-ddcf8d",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9b270c",
  "org.scalablytyped" %%% "dayjs" % "1.11.6-888fdf",
  "org.scalablytyped" %%% "moment" % "2.29.4-c1da03",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-9c1d48",
  "org.scalablytyped" %%% "rc-cascader" % "3.7.0-a46ecb",
  "org.scalablytyped" %%% "rc-component__portal" % "1.0.3-65822e",
  "org.scalablytyped" %%% "rc-dialog" % "9.0.2-a59ed4",
  "org.scalablytyped" %%% "rc-drawer" % "6.0.1-4f8ff5",
  "org.scalablytyped" %%% "rc-field-form" % "1.27.3-6f2eab",
  "org.scalablytyped" %%% "rc-image" % "5.12.0-4c8720",
  "org.scalablytyped" %%% "rc-input" % "0.1.4-afea3f",
  "org.scalablytyped" %%% "rc-input-number" % "7.3.9-ae74d7",
  "org.scalablytyped" %%% "rc-mentions" % "1.11.0-cd18ff",
  "org.scalablytyped" %%% "rc-menu" % "9.7.2-8f60c1",
  "org.scalablytyped" %%% "rc-motion" % "2.6.2-08d930",
  "org.scalablytyped" %%% "rc-notification" % "4.6.1-14050d",
  "org.scalablytyped" %%% "rc-pagination" % "3.2.0-a06860",
  "org.scalablytyped" %%% "rc-picker" % "2.7.0-20f7b6",
  "org.scalablytyped" %%% "rc-rate" % "2.9.2-5353aa",
  "org.scalablytyped" %%% "rc-segmented" % "2.1.0-dd5158",
  "org.scalablytyped" %%% "rc-select" % "14.1.13-12d094",
  "org.scalablytyped" %%% "rc-slider" % "10.1.0-62489b",
  "org.scalablytyped" %%% "rc-steps" % "6.0.0-alpha.2-f01d23",
  "org.scalablytyped" %%% "rc-table" % "7.28.1-7adde4",
  "org.scalablytyped" %%% "rc-tabs" % "12.3.0-4f6ece",
  "org.scalablytyped" %%% "rc-textarea" % "0.4.6-49ef5e",
  "org.scalablytyped" %%% "rc-tooltip" % "5.2.2-36f102",
  "org.scalablytyped" %%% "rc-tree" % "5.7.0-af7014",
  "org.scalablytyped" %%% "rc-tree-select" % "5.5.3-c25254",
  "org.scalablytyped" %%% "rc-trigger" % "5.3.3-d77f96",
  "org.scalablytyped" %%% "rc-upload" % "4.3.4-85af1d",
  "org.scalablytyped" %%% "rc-util" % "5.24.4-163fd4",
  "org.scalablytyped" %%% "rc-virtual-list" % "3.4.8-da24ec",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-c1aa2f",
  "org.scalablytyped" %%% "react-dom" % "18.0-dt-20221114Z-dfc723",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fd69ea",
  "org.scalablytyped" %%% "scroll-into-view-if-needed" % "2.2.29-0be73e",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
