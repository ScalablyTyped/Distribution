organization := "org.scalablytyped"
name := "activex-word"
version := "14.0-dt-20190213Z-aa07b6"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20190213Z-adc925",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-aad963",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-4042fc",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20190213Z-5fd61b",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        