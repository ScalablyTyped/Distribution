organization := "org.scalablytyped"
name := "alpinejs__focus"
version := "3.10-dt-20221017Z-49e515"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "alpinejs" % "3.7-dt-20220113Z-ca6135",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.41-d09629",
  "org.scalablytyped" %%% "vue__shared" % "3.2.41-a50cde")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
