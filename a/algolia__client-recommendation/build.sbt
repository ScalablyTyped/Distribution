organization := "org.scalablytyped"
name := "algolia__client-recommendation"
version := "4.1.0-48211c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.1.0-4d2f67",
  "org.scalablytyped" %%% "algolia__client-common" % "4.1.0-b270c7",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.1.0-b7a77e",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.1.0-c696f1",
  "org.scalablytyped" %%% "algolia__transporter" % "4.1.0-fb7267",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
