organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20190213Z-87d708"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-e859f2",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20190503Z-12760f",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20190213Z-22f958",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-f18585",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        