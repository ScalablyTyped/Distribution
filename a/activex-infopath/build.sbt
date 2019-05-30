organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20190213Z-ba4e62"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-6dce4d",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20190503Z-9a46d9",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20190213Z-696813",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-d15fd7",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        