organization := "org.scalablytyped"
name := "angular-ui-router-uib-modal"
version := "0.0.11-312917"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20180918Z-9a8364",
  "org.scalablytyped" %%% "angular-ui-bootstrap" % "0.13.3-dt-20180910Z-0038f2",
  "org.scalablytyped" %%% "angular-ui-router" % "1.1.38-dt-20180910Z-29cee4",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        