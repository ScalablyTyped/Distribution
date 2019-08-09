organization := "org.scalablytyped"
name := "app-builder-lib"
version := "20.44.4-ccecb9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "builder-util" % "10.1.2-d93a49",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.5-b1b290",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-621a6e",
  "org.scalablytyped" %%% "electron-publish" % "20.44.4-faad50",
  "org.scalablytyped" %%% "fs-extra-p" % "8.1.0-ae03f3",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-ec85d9",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190807Z-ed4b3f",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "temp-file" % "3.3.4-d26ab4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        