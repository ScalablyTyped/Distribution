organization := "org.scalablytyped"
name := "activex-word"
version := "14.0-dt-20220705Z-f4f4e9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20220705Z-0e9511",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20220705Z-4afb21",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20220705Z-cf7922",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20220705Z-7d2b3b",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
