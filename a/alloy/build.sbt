organization := "org.scalablytyped"
name := "alloy"
version := "1.14-dt-20191113Z-4da1e2"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "backbone" % "1.4-dt-20190619Z-ab3865",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190815Z-17006e",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-a5fece",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "titanium" % "8.0-dt-20191113Z-69dbde",
  "org.scalablytyped" %%% "underscore" % "1.9-dt-20190918Z-f85423")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        