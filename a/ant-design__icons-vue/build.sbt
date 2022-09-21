organization := "org.scalablytyped"
name := "ant-design__icons-vue"
version := "6.1.0-5067d1"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ant-design__icons-svg" % "4.2.1-331260",
  "org.scalablytyped" %%% "csstype" % "3.1.1-7b6cf2",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.39-568d09",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.39-306966",
  "org.scalablytyped" %%% "vue__runtime-dom" % "3.2.39-d6ab0c",
  "org.scalablytyped" %%% "vue__shared" % "3.2.39-9042cc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
