organization := "org.scalablytyped"
name := "adone"
version := "0.6-dt-20190311Z-c6ee15"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "assert" % "1.4-dt-20190212Z-f826da",
  "org.scalablytyped" %%% "async" % "3.0-dt-20190604Z-6ef29f",
  "org.scalablytyped" %%% "benchmark" % "v1.0.0-dt-20190322Z-7b43bc",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190606Z-454408",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-b8909f",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        