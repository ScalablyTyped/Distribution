organization := "org.scalablytyped"
name := "activex-access"
version := "14.0-dt-20190213Z-b3aaed"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-60a590",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20190213Z-c76f87",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20190213Z-3bf3aa",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-379376",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-847469",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20190213Z-0b44c0",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        