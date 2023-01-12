organization := "org.scalablytyped"
name := "alpinejs__focus"
version := "3.10-dt-20221017Z-4329de"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "alpinejs" % "3.7-dt-20221028Z-9416b4",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.45-85ea73",
  "org.scalablytyped" %%% "vue__shared" % "3.2.45-ab0053")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
