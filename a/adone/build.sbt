organization := "org.scalablytyped"
name := "adone"
version := "0.6-dt-20190311Z-f56d10"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "assert" % "1.4-dt-20190725Z-e7539e",
  "org.scalablytyped" %%% "async" % "3.0-dt-20190925Z-91e680",
  "org.scalablytyped" %%% "benchmark" % "v1.0.0-dt-20190322Z-a3af48",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190927Z-841532",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-e91184",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        