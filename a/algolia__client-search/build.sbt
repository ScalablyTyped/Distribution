organization := "org.scalablytyped"
name := "algolia__client-search"
version := "4.8.0-c34811"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.8.0-141b1e",
  "org.scalablytyped" %%% "algolia__client-common" % "4.8.0-3fcf34",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.8.0-6196c1",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.8.0-4f09db",
  "org.scalablytyped" %%% "algolia__transporter" % "4.8.0-90b6d0",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
