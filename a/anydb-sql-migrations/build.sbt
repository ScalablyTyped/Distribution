organization := "org.scalablytyped"
name := "anydb-sql-migrations"
version := "2.3.1-24c1c1"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "any-db" % "2.1.0-dt-20180214Z-0f532b",
  "org.scalablytyped" %%% "any-db-transaction" % "2.2.1-dt-20180214Z-a8d4fc",
  "org.scalablytyped" %%% "anydb-sql" % "0.7.0-b634b9",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-8f594d",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-b7dcf8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "sqlite3" % "3.1-dt-20180322Z-61667c",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20181220Z-2479ce")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        