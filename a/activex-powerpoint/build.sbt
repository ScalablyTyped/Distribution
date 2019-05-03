organization := "org.scalablytyped"
name := "activex-powerpoint"
version := "14.0-dt-20190213Z-da7fac"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20190213Z-1ca8a3",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-9dbb06",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-3f2faf",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20190213Z-3cf4e3",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        