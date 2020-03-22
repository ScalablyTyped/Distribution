organization := "org.scalablytyped"
name := "algolia__client-account"
version := "4.0.3-8ac0d3"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.0.3-3abf6d",
  "org.scalablytyped" %%% "algolia__client-common" % "4.0.3-ecdeea",
  "org.scalablytyped" %%% "algolia__client-search" % "4.0.3-24aca0",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.0.3-5461f7",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.0.3-aa83c9",
  "org.scalablytyped" %%% "algolia__transporter" % "4.0.3-9e9bf0",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
