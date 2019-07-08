organization := "org.scalablytyped"
name := "adone"
version := "0.6-dt-20190311Z-4b24a4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "assert" % "1.4-dt-20190212Z-c1f829",
  "org.scalablytyped" %%% "async" % "3.0-dt-20190604Z-9b8434",
  "org.scalablytyped" %%% "benchmark" % "v1.0.0-dt-20190322Z-557739",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190626Z-08a773",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-a67e53",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        