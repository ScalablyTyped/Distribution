organization := "org.scalablytyped"
name := "angular__http"
version := "7.2.16-50eb6e"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__compiler" % "9.0.4-18b320",
  "org.scalablytyped" %%% "angular__core" % "9.0.4-465e93",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-a98e44",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "rxjs" % "6.5.4-b9e2d2",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.4-d90dcd",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200121Z-d9d5b7",
  "org.scalablytyped" %%% "typescript" % "3.8.3-4c59b2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
