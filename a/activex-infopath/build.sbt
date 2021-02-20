organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20200515Z-b421aa"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20200515Z-37c4a4",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20200515Z-6cad61",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20200515Z-daf118",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20200515Z-cc01ae",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
