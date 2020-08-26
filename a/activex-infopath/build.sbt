organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20200515Z-040585"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20200515Z-9260d8",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20200515Z-f61805",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20200515Z-c3ab05",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20200515Z-3bfc18",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
