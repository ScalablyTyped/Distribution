organization := "org.scalablytyped"
name := "apollo-engine-reporting"
version := "1.1.0-c0c29f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.3.0-c01486",
  "org.scalablytyped" %%% "apollo-server-env" % "2.3.0-473eda",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-3a9110",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-07594f",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-2c1544",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        