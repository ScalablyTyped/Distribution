organization := "org.scalablytyped"
name := "apollo-engine-reporting"
version := "1.3.1-77467b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.3.1-6ec230",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.0-3db4d7",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190616Z-a68a9c",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-01bc11",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        