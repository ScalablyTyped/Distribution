organization := "org.scalablytyped"
name := "algolia__client-recommendation"
version := "4.8.0-3595cc"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.8.0-d90ed9",
  "org.scalablytyped" %%% "algolia__client-common" % "4.8.0-3a6383",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.8.0-97ba34",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.8.0-88536f",
  "org.scalablytyped" %%% "algolia__transporter" % "4.8.0-a32a08",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
