organization := "org.scalablytyped"
name := "algolia__client-analytics"
version := "4.2.0-af50b7"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.2.0-46ab80",
  "org.scalablytyped" %%% "algolia__client-common" % "4.2.0-bcf77f",
  "org.scalablytyped" %%% "algolia__client-search" % "4.2.0-6888f0",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.2.0-f657d9",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.2.0-f55100",
  "org.scalablytyped" %%% "algolia__transporter" % "4.2.0-77fc84",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
