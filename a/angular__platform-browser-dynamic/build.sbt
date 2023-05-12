organization := "org.scalablytyped"
name := "angular__platform-browser-dynamic"
version := "16.0.1-3dbd48"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "angular__animations" % "16.0.1-56a14f",
  "org.scalablytyped" %%% "angular__common" % "16.0.1-502481",
  "org.scalablytyped" %%% "angular__core" % "16.0.1-b2d06d",
  "org.scalablytyped" %%% "angular__platform-browser" % "16.0.1-edb61a",
  "org.scalablytyped" %%% "rxjs" % "7.8.1-1301bf",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
