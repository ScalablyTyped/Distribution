organization := "org.scalablytyped"
name := "apollo-reporting-protobuf"
version := "0.6.1-85d7b4"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.5-5d69d5",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20201002Z-fa90ce",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
