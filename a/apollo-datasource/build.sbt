organization := "org.scalablytyped"
name := "apollo-datasource"
version := "3.3.2-a63837"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "apollo__utils_dot_keyvaluecache" % "1.0.1-232532",
  "org.scalablytyped" %%% "apollo__utils_dot_logger" % "1.0.1-e283d7",
  "org.scalablytyped" %%% "lru-cache" % "7.14.1-448518",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
