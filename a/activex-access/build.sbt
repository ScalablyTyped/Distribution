organization := "org.scalablytyped"
name := "activex-access"
version := "14.0-dt-20200515Z-2b4175"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20200515Z-0ab808",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20200515Z-e8d4cf",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20200515Z-826b64",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20200515Z-edd90e",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20200515Z-65ceec",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20200515Z-68c611",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
