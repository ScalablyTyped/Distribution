organization := "org.scalablytyped"
name := "activex-vbide"
version := "14.0-dt-20190213Z-3ccaf9"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20190213Z-f58b9b",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-678007",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-cae083",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
