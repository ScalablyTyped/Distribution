organization := "org.scalablytyped"
name := "algolia__client-common"
version := "4.3.1-55c6b0"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.3.1-56cdfc",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.3.1-6d87d4",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.3.1-0443b4",
  "org.scalablytyped" %%% "algolia__transporter" % "4.3.1-41e4e0",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
