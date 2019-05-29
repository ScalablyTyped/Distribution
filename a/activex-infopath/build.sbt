organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20190213Z-a8ce92"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-ee2a72",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20190503Z-9a46d9",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20190213Z-696813",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-bf4648",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        