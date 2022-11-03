organization := "org.scalablytyped"
name := "apollo-datasource"
version := "3.3.2-df3a07"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "apollo__utils_dot_keyvaluecache" % "1.0.1-558abf",
  "org.scalablytyped" %%% "apollo__utils_dot_logger" % "1.0.1-551477",
  "org.scalablytyped" %%% "lru-cache" % "7.14.1-5473ac",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
