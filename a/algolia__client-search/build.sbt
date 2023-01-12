organization := "org.scalablytyped"
name := "algolia__client-search"
version := "4.14.2-e36e98"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.14.2-0f67b5",
  "org.scalablytyped" %%% "algolia__client-common" % "4.14.2-ad6626",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.14.2-ca8844",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.14.2-983996",
  "org.scalablytyped" %%% "algolia__transporter" % "4.14.2-3f1e9b",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
