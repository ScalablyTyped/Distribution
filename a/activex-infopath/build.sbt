organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20200225Z-2bfea0"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20200225Z-ed3762",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20200225Z-cd1a91",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20200225Z-a6e070",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20200225Z-f087da",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
