organization := "org.scalablytyped"
name := "apollo-client"
version := "2.4.7-ceb9bc"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.1.21-e87821",
  "org.scalablytyped" %%% "apollo-link" % "1.2.4-b0ec7c",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.11-886972",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.26-062b35",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-6c0a30",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-f84511",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-962402",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.11-76cd5d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        