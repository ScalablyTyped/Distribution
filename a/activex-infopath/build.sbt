organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20190213Z-dd6514"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-875ad4",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20190503Z-ae5c8a",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20190213Z-b69d27",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-5144ec",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        