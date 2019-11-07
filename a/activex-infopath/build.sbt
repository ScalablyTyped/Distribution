organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20190213Z-53e364"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-d56b70",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20190503Z-991857",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20190213Z-259cdb",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-c1fdd8",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        