organization := "org.scalablytyped"
name := "app-builder-lib"
version := "22.9.1-b6b7a1"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "builder-util" % "22.9.1-00c320",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.7.2-2a964f",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-423206",
  "org.scalablytyped" %%% "electron-publish" % "22.9.1-577e2a",
  "org.scalablytyped" %%% "fs-extra" % "9.0-dt-20201111Z-54798c",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-7b7791",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "temp-file" % "3.3.7-103dd5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
