organization := "org.scalablytyped"
name := "activex-access"
version := "14.0-dt-20190213Z-dd7043"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-d38d7b",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20190213Z-d8de0e",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20190213Z-0d0297",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-81508d",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-235348",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20190213Z-008bd4",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        