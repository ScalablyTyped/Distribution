organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20190213Z-cb9027"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-358080",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20190503Z-21cf66",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20190213Z-e23a60",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-30de0d",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
