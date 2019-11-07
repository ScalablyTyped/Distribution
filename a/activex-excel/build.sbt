organization := "org.scalablytyped"
name := "activex-excel"
version := "14.0-dt-20190213Z-bda3e5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-d56b70",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20190213Z-1dd014",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20190213Z-64ad3e",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-e10160",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-c1fdd8",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20190213Z-d339ab",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        