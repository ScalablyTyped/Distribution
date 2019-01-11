organization := "org.scalablytyped"
name := "anydb-sql-migrations"
version := "2.4.1-c1e661"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "any-db" % "2.1.0-dt-20180214Z-132f67",
  "org.scalablytyped" %%% "any-db-transaction" % "2.2.1-dt-20180214Z-5ca13b",
  "org.scalablytyped" %%% "anydb-sql" % "0.7.1-7d6a02",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-a33d29",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-010a28",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "node-sql-2" % "0.78.0-24e6aa",
  "org.scalablytyped" %%% "sqlite3" % "3.1-dt-20180322Z-46ca0d",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20181231Z-a71d52")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        