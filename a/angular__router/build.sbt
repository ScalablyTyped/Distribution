organization := "org.scalablytyped"
name := "angular__router"
version := "9.1.2-7b5e0d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__common" % "9.1.2-9800e1",
  "org.scalablytyped" %%% "angular__compiler" % "9.1.2-cf144c",
  "org.scalablytyped" %%% "angular__core" % "9.1.2-795c54",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20200226Z-8b5ea8",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "rxjs" % "6.5.5-62f03a",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.5-7f568a",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200225Z-9f3b8d",
  "org.scalablytyped" %%% "typescript" % "3.8.3-9c93d4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
