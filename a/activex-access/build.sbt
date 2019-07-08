organization := "org.scalablytyped"
name := "activex-access"
version := "14.0-dt-20190213Z-8a9048"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-1682b7",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20190213Z-7656e5",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20190213Z-34f2b2",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-3b5650",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-deb5b0",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20190213Z-e90942",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        