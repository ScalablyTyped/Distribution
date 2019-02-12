organization := "org.scalablytyped"
name := "angular__router"
version := "7.2.4-294640"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular__common" % "7.2.4-cd29c8",
  "org.scalablytyped" %%% "angular__core" % "7.2.4-051b7f",
  "org.scalablytyped" %%% "angular__platform-browser" % "7.2.4-0f71e8",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "rxjs" % "6.4.0-7a012b",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "tslib" % "1.9.3-2d26d9",
  "org.scalablytyped" %%% "zone_dot_js" % "0.8.29-b10536")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        