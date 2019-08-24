organization := "org.scalablytyped"
name := "autoprefixer"
version := "9.6-dt-20190819Z-48d112"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "browserslist" % "4.4-dt-20190311Z-9d6171",
  "org.scalablytyped" %%% "postcss" % "7.0.17-a2c8cd",
  "org.scalablytyped" %%% "source-map" % "0.7.3-04c49c",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        