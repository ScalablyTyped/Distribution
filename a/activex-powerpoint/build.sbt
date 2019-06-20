organization := "org.scalablytyped"
name := "activex-powerpoint"
version := "14.0-dt-20190213Z-8716ab"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20190213Z-732ab5",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-0a74ba",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-87cce9",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20190213Z-ab77a4",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        