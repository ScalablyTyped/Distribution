organization := "org.scalablytyped"
name := "antv__component"
version := "0.8.2-4db784"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "antv__event-emitter" % "0.1.2-17bf6a",
  "org.scalablytyped" %%% "antv__g-base" % "0.5.1-4358b9",
  "org.scalablytyped" %%% "d3-timer" % "2.0-dt-20201002Z-3ffd74",
  "org.scalablytyped" %%% "gl-matrix" % "3.3.0-145fd0",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
