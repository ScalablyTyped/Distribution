organization := "org.scalablytyped"
name := "activex-vbide"
version := "14.0-dt-20190213Z-37a797"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20190213Z-273422",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-9241bf",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-09677f",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        