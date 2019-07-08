organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20190213Z-7d7163"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-1682b7",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20190503Z-7d979a",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20190213Z-d02c6e",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-deb5b0",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        