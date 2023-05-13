organization := "org.scalablytyped"
name := "alpinejs__focus"
version := "3.10-dt-20221017Z-e983e4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "alpinejs" % "3.7-dt-20230328Z-cde5b5",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "vue__reactivity" % "3.3.2-725762",
  "org.scalablytyped" %%% "vue__shared" % "3.3.2-d52317")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
