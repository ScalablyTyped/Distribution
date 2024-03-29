organization := "org.scalablytyped"
name := "alpinejs__focus"
version := "3.10-dt-20221017Z-d29211"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "alpinejs" % "3.7-dt-20230621Z-f32266",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2",
  "org.scalablytyped" %%% "vue__reactivity" % "3.3.4-d857ba",
  "org.scalablytyped" %%% "vue__shared" % "3.3.4-e8ded7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
