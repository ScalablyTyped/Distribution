organization := "org.scalablytyped"
name := "amap-js-api-driving"
version := "1.4-dt-20190528Z-2ef47c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "amap-js-api" % "1.4-dt-20200129Z-e11e53",
  "org.scalablytyped" %%% "amap-js-api-place-search" % "1.4-dt-20190326Z-1f0bab",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
