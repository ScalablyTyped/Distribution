organization := "org.scalablytyped"
name := "angular__http"
version := "7.2.8-26fe61"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular__common" % "7.2.8-41b2f2",
  "org.scalablytyped" %%% "angular__core" % "7.2.8-ac12e4",
  "org.scalablytyped" %%% "angular__platform-browser" % "7.2.8-40f318",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "rxjs" % "6.4.0-1dd9f6",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "tslib" % "1.9.3-d28c21",
  "org.scalablytyped" %%% "zone_dot_js" % "0.8.29-2acb83")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        