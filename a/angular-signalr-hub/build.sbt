organization := "org.scalablytyped"
name := "angular-signalr-hub"
version := "v1.5.0-dt-20230322Z-251e53"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20221231Z-11244e",
  "org.scalablytyped" %%% "signalr" % "2.4.3-dt-20221103Z-308f95",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-ee1324",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
