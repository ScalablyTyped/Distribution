organization := "org.scalablytyped"
name := "activex-access"
version := "14.0-dt-20190213Z-4e7c9a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-71b24e",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20190213Z-547c73",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20190213Z-f58b9b",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-678007",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-cae083",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20190213Z-3ccaf9",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
