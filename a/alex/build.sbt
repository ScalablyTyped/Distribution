organization := "org.scalablytyped"
name := "alex"
version := "8.1-dt-20200218Z-7f7567"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20190213Z-0c6228",
  "org.scalablytyped" %%% "vfile" % "4.1.1-d5ff25",
  "org.scalablytyped" %%% "vfile-message" % "2.0.4-7e3ace")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
