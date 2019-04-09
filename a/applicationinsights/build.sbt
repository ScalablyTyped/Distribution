organization := "org.scalablytyped"
name := "applicationinsights"
version := "1.3.1-f5428d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cls-hooked" % "4.3-dt-20190303Z-ab5e89",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-2441c4",
  "org.scalablytyped" %%% "diagnostic-channel" % "0.2.0-4db31e",
  "org.scalablytyped" %%% "diagnostic-channel-publishers" % "0.3.0-92bc43",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190408Z-6fa8bf",
  "org.scalablytyped" %%% "semver" % "6.0-dt-20190330Z-1b8b1f",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        