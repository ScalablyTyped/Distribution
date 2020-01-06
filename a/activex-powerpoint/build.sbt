organization := "org.scalablytyped"
name := "activex-powerpoint"
version := "14.0-dt-20190213Z-a4e502"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20190213Z-17e3e0",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-1722e3",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-4daa0d",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20190213Z-cedefb",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        