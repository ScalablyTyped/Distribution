organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20190213Z-f6bc08"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-71b24e",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20190503Z-21cf66",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20190213Z-e23a60",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-cae083",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
