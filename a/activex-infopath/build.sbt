organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20200515Z-e6108e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20200515Z-b807bd",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20200515Z-9febfc",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20200515Z-84d6a5",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20200515Z-3d2bd3",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
