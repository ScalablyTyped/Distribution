organization := "org.scalablytyped"
name := "activex-excel"
version := "14.0-dt-20190213Z-147618"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-358080",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20190213Z-85cad4",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20190213Z-b6980a",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-a68a93",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-30de0d",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20190213Z-8ffa98",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
