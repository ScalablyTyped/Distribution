organization := "org.scalablytyped"
name := "ant-design__icons-vue"
version := "6.1.0-523db9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ant-design__icons-svg" % "4.2.1-d2c1aa",
  "org.scalablytyped" %%% "csstype" % "3.1.1-4db30e",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.45-433ea1",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.45-ccab93",
  "org.scalablytyped" %%% "vue__runtime-dom" % "3.2.45-419c39",
  "org.scalablytyped" %%% "vue__shared" % "3.2.45-86009a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
