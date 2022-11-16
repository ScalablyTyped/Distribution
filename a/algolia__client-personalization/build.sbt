organization := "org.scalablytyped"
name := "algolia__client-personalization"
version := "4.14.2-dfc89a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.14.2-6fb5c4",
  "org.scalablytyped" %%% "algolia__client-common" % "4.14.2-befd11",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.14.2-accbf5",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.14.2-cfec5f",
  "org.scalablytyped" %%% "algolia__transporter" % "4.14.2-ff0528",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
