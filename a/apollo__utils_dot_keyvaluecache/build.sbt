organization := "org.scalablytyped"
name := "apollo__utils_dot_keyvaluecache"
version := "1.0.1-c5d81b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "apollo__utils_dot_logger" % "1.0.1-551477",
  "org.scalablytyped" %%% "lru-cache" % "7.14.0-c21024",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
