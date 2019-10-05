organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20190213Z-717a11"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-f8a4cf",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20190503Z-991857",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20190213Z-259cdb",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-7bbc2b",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        