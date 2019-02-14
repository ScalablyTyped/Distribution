organization := "org.scalablytyped"
name := "apollo-link"
version := "1.2.8-9b747f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-467272",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-6cdd80",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.15-0ed4ab")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        