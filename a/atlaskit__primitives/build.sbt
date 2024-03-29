organization := "org.scalablytyped"
name := "atlaskit__primitives"
version := "0.9.2-dea16f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "atlaskit__tokens" % "1.4.1-156371",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20230426Z-96f2d9",
  "org.scalablytyped" %%% "babel__types" % "7.21.5-fbdd8a",
  "org.scalablytyped" %%% "bind-event-listener" % "3.0.0-aa2323",
  "org.scalablytyped" %%% "csstype" % "3.1.2-5927f3",
  "org.scalablytyped" %%% "emotion__serialize" % "1.1.2-c0931d",
  "org.scalablytyped" %%% "emotion__utils" % "1.2.1-2b32a4",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4446ee",
  "org.scalablytyped" %%% "react" % "18.2-dt-20230506Z-14ab9d",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20230322Z-da1b40",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
