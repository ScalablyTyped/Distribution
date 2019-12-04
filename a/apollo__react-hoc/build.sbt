organization := "org.scalablytyped"
name := "apollo__react-hoc"
version := "3.1.3-4254ae"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.2-f1876f",
  "org.scalablytyped" %%% "apollo-client" % "2.6.4-23bedf",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-3e9d24",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.2-18a762",
  "org.scalablytyped" %%% "apollo__react-common" % "3.1.3-34b2a2",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "graphql" % "14.5.8-92eff2",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191126Z-3d1d47",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-b9c39c",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-760cc5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        