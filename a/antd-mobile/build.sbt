organization := "org.scalablytyped"
name := "antd-mobile"
version := "5.30.0-458829"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.2-5927f3",
  "org.scalablytyped" %%% "dayjs" % "1.11.7-974103",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4446ee",
  "org.scalablytyped" %%% "rc-field-form" % "1.31.0-451c99",
  "org.scalablytyped" %%% "react" % "18.2-dt-20230506Z-14ab9d",
  "org.scalablytyped" %%% "react-dom" % "18.2-dt-20230505Z-9874d1",
  "org.scalablytyped" %%% "react-spring__animated" % "9.7.2-f9bdf2",
  "org.scalablytyped" %%% "react-spring__core" % "9.7.2-4bc936",
  "org.scalablytyped" %%% "react-spring__rafz" % "9.7.2-dce242",
  "org.scalablytyped" %%% "react-spring__shared" % "9.7.2-d04613",
  "org.scalablytyped" %%% "react-spring__types" % "9.7.2-f506c9",
  "org.scalablytyped" %%% "react-spring__web" % "9.7.2-e99ef6",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20230322Z-da1b40",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "use-gesture__react" % "10.2.26-242b2f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
