organization := "org.scalablytyped"
name := "activex-word"
version := "14.0-dt-20190213Z-adc1ad"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20190213Z-40c7c4",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-116dae",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-b99725",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20190213Z-80b823",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        