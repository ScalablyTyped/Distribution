organization := "org.scalablytyped"
name := "autoprefixer"
version := "9.5-dt-20190504Z-5c58f7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "browserslist" % "4.4-dt-20190311Z-ba9254",
  "org.scalablytyped" %%% "postcss" % "6.0.23-b0dcf2",
  "org.scalablytyped" %%% "source-map" % "0.7.3-04ee27",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        