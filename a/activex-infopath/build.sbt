organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20190213Z-8b9f9a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-a5ad82",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20190503Z-09a327",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20190213Z-b3ddee",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-0b7200",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        