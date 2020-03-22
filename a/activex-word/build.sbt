organization := "org.scalablytyped"
name := "activex-word"
version := "14.0-dt-20200225Z-5b3df9"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20200225Z-7c09d3",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20200225Z-a5b501",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20200225Z-cae083",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20200225Z-913b1a",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
