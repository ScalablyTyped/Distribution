organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20190213Z-b2a7d3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-a863b4",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20190503Z-c5ceb1",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20190213Z-a780bf",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-163c42",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        