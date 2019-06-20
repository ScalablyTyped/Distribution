organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20190213Z-35e043"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-cd20de",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20190503Z-ae5c8a",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20190213Z-b69d27",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-87cce9",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        