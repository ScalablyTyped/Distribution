organization := "org.scalablytyped"
name := "alex"
version := "10.0.0-19be40"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-e12bb0",
  "org.scalablytyped" %%% "nlcst" % "1.0-dt-20220624Z-5107f7",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "unified" % "10.1.2-7e2642",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-e61dba",
  "org.scalablytyped" %%% "vfile" % "5.3.5-987163",
  "org.scalablytyped" %%% "vfile-message" % "3.1.2-6108f4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
