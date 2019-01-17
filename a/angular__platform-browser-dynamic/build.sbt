organization := "org.scalablytyped"
name := "angular__platform-browser-dynamic"
version := "7.2.1-80d124"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular__common" % "7.2.1-3c8a68",
  "org.scalablytyped" %%% "angular__compiler" % "7.2.1-4c1759",
  "org.scalablytyped" %%% "angular__core" % "7.2.1-c037c9",
  "org.scalablytyped" %%% "angular__platform-browser" % "7.2.1-c72f37",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "rxjs" % "6.3.3-08fcfc",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "tslib" % "1.9.3-cc9481",
  "org.scalablytyped" %%% "zone_dot_js" % "0.8.28-6288c5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        