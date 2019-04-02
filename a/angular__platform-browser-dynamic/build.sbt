organization := "org.scalablytyped"
name := "angular__platform-browser-dynamic"
version := "7.2.11-484522"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular__common" % "7.2.11-55a5fd",
  "org.scalablytyped" %%% "angular__compiler" % "7.2.11-fb0c0c",
  "org.scalablytyped" %%% "angular__core" % "7.2.11-a6d44a",
  "org.scalablytyped" %%% "angular__platform-browser" % "7.2.11-f4e5c9",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "rxjs" % "6.4.0-f8b93e",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "tslib" % "1.9.3-446b32",
  "org.scalablytyped" %%% "zone_dot_js" % "0.9.0-886315")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        