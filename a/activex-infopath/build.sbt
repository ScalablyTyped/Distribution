organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20190213Z-c7b356"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-137fb3",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20190503Z-88dfc7",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20190213Z-f1419f",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-4daa0d",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        