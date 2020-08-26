organization := "org.scalablytyped"
name := "angular__common"
version := "10.0.7-5e20d9"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__compiler" % "10.0.7-33435e",
  "org.scalablytyped" %%% "angular__core" % "10.0.7-172a73",
  "org.scalablytyped" %%% "inquirer" % "7.3-dt-20200721Z-bd5cf0",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "rxjs" % "6.6.2-ccb1c2",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.2-08247c",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200515Z-efda06",
  "org.scalablytyped" %%% "typescript" % "3.9.7-9f5184")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
