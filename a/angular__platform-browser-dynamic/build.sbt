organization := "org.scalablytyped"
name := "angular__platform-browser-dynamic"
version := "10.0.7-8f8f7c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__compiler" % "10.0.7-7ebd0a",
  "org.scalablytyped" %%% "angular__core" % "10.0.7-35cbe2",
  "org.scalablytyped" %%% "inquirer" % "7.3-dt-20200721Z-d60096",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-371e98",
  "org.scalablytyped" %%% "rxjs" % "6.6.2-78d49c",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.2-a43b8e",
  "org.scalablytyped" %%% "std" % "3.9-7c0472",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200515Z-2ac8fc",
  "org.scalablytyped" %%% "typescript" % "3.9.7-1b8dbc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
