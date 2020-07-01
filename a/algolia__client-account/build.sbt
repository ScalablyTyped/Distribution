organization := "org.scalablytyped"
name := "algolia__client-account"
version := "4.3.0-005340"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.3.0-b99a42",
  "org.scalablytyped" %%% "algolia__client-common" % "4.3.0-bdcb9c",
  "org.scalablytyped" %%% "algolia__client-search" % "4.3.0-353dce",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.3.0-841cc9",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.3.0-2f55ee",
  "org.scalablytyped" %%% "algolia__transporter" % "4.3.0-33f33b",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
