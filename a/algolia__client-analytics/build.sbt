organization := "org.scalablytyped"
name := "algolia__client-analytics"
version := "4.1.0-221f3c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.1.0-e63502",
  "org.scalablytyped" %%% "algolia__client-common" % "4.1.0-6ee8eb",
  "org.scalablytyped" %%% "algolia__client-search" % "4.1.0-fe2af0",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.1.0-aa946e",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.1.0-6f63dd",
  "org.scalablytyped" %%% "algolia__transporter" % "4.1.0-62e400",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
