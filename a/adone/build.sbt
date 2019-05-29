organization := "org.scalablytyped"
name := "adone"
version := "0.6-dt-20190311Z-5ad627"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "assert" % "1.4-dt-20190212Z-8009b9",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190508Z-d431c2",
  "org.scalablytyped" %%% "benchmark" % "v1.0.0-dt-20190322Z-527724",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190523Z-e414eb",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        