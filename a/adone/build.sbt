organization := "org.scalablytyped"
name := "adone"
version := "0.6-dt-20190311Z-2328b7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "assert" % "1.4-dt-20190212Z-982eb3",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-f5a815",
  "org.scalablytyped" %%% "benchmark" % "v1.0.0-dt-20190322Z-4acae0",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-3d2db0",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-84ec9f",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        