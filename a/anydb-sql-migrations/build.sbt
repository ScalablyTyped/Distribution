organization := "org.scalablytyped"
name := "anydb-sql-migrations"
version := "2.4.1-ec5ef3"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "anydb-sql" % "0.7.1-8c8fad",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20221103Z-6d7ec9",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
