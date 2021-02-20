organization := "org.scalablytyped"
name := "activex-word"
version := "14.0-dt-20201028Z-2f4505"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20201028Z-26fa1c",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20200515Z-93bc73",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20200515Z-cc01ae",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20200515Z-f612d1",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
