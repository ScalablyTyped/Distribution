organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20190213Z-70efaf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-d38d7b",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20190503Z-62cac8",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20190213Z-7a4327",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-235348",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        