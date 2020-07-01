organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20200515Z-da9137"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20200515Z-4a7a43",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20200515Z-19e317",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20200515Z-14f4c0",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20200515Z-9e7238",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
