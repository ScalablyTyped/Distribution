organization := "org.scalablytyped"
name := "activex-vbide"
version := "14.0-dt-20190213Z-318d1f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20190213Z-cb9e22",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-84ec1c",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-0ae63e",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        