organization := "org.scalablytyped"
name := "activex-excel"
version := "14.0-dt-20200515Z-331be7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20200515Z-9260d8",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20200515Z-aaad9d",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20200515Z-475773",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20200515Z-00de8c",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20200515Z-3bfc18",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20200515Z-0e31ef",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
