organization := "org.scalablytyped"
name := "algolia__client-common"
version := "4.8.0-28dcab"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.8.0-f0cea6",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.8.0-fdbb57",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.8.0-1c03c5",
  "org.scalablytyped" %%% "algolia__transporter" % "4.8.0-c18b5b",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
