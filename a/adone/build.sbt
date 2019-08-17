organization := "org.scalablytyped"
name := "adone"
version := "0.6-dt-20190311Z-0a09a7"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "assert" % "1.4-dt-20190725Z-9cc592",
  "org.scalablytyped" %%% "async" % "3.0-dt-20190722Z-020c75",
  "org.scalablytyped" %%% "benchmark" % "v1.0.0-dt-20190322Z-1f8d1a",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190816Z-cbbb3c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-2dc4df",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        