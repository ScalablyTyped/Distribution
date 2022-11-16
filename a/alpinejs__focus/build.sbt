organization := "org.scalablytyped"
name := "alpinejs__focus"
version := "3.10-dt-20221017Z-ac682b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "alpinejs" % "3.7-dt-20221028Z-a3e320",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.45-6cbfdc",
  "org.scalablytyped" %%% "vue__shared" % "3.2.45-9a03c8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
