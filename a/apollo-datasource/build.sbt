organization := "org.scalablytyped"
name := "apollo-datasource"
version := "3.3.2-5a2f7f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "apollo__utils_dot_keyvaluecache" % "1.0.1-28a67d",
  "org.scalablytyped" %%% "apollo__utils_dot_logger" % "1.0.0-5454e4",
  "org.scalablytyped" %%% "lru-cache" % "7.14.0-0e6613",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
