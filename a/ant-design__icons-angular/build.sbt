organization := "org.scalablytyped"
name := "ant-design__icons-angular"
version := "8.0.3-82bdb4"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__common" % "8.2.3-760804",
  "org.scalablytyped" %%% "angular__core" % "8.2.3-c8065d",
  "org.scalablytyped" %%% "angular__platform-browser" % "8.2.3-053c92",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-8fa5f3",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        