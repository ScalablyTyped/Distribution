organization := "org.scalablytyped"
name := "ant-design__icons-angular"
version := "8.0.3-fe8d66"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__common" % "8.2.3-0e51a4",
  "org.scalablytyped" %%% "angular__core" % "8.2.3-1b87e9",
  "org.scalablytyped" %%% "angular__platform-browser" % "8.2.3-bd675c",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-1ca89d",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        