organization := "org.scalablytyped"
name := "alloy"
version := "1.14-dt-20191119Z-aaa48e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "backbone" % "1.4-dt-20190619Z-a50d6a",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20191126Z-36922a",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-2d253b",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "titanium" % "8.0-dt-20191119Z-b3ed65",
  "org.scalablytyped" %%% "underscore" % "1.9-dt-20191118Z-6a6110")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        