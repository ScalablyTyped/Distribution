organization := "org.scalablytyped"
name := "angular__platform-browser-dynamic"
version := "7.2.0-384d8b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular__common" % "7.2.0-f526f0",
  "org.scalablytyped" %%% "angular__compiler" % "7.2.0-9771d7",
  "org.scalablytyped" %%% "angular__core" % "7.2.0-2b1fc6",
  "org.scalablytyped" %%% "angular__platform-browser" % "7.2.0-9022a4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "rxjs" % "6.3.3-3de002",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "tslib" % "1.9.3-d3fc19",
  "org.scalablytyped" %%% "zone_dot_js" % "0.8.27-e4baec")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        