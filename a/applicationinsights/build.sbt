organization := "org.scalablytyped"
name := "applicationinsights"
version := "1.2.0-a447af"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cls-hooked" % "4.3-dt-20190303Z-8697d7",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-d23299",
  "org.scalablytyped" %%% "diagnostic-channel" % "0.2.0-3b35db",
  "org.scalablytyped" %%% "diagnostic-channel-publishers" % "0.3.0-9b7a08",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190311Z-8b4969",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cc5b51",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        