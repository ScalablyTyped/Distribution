organization := "org.scalablytyped"
name := "activex-excel"
version := "14.0-dt-20200225Z-95e8ae"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20200225Z-ed3762",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20200225Z-a052ae",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20200225Z-1945e9",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20200225Z-dcc3ab",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20200225Z-f087da",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20200225Z-02db44",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
