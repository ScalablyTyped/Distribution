organization := "org.scalablytyped"
name := "anydb-sql-migrations"
version := "2.4.1-49e3cd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "any-db" % "2.1.0-dt-20180214Z-44d855",
  "org.scalablytyped" %%% "any-db-transaction" % "2.2.1-dt-20180214Z-005f5b",
  "org.scalablytyped" %%% "anydb-sql" % "0.7.1-8a8f4c",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-865309",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-2e7712",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "node-sql-2" % "0.78.0-8cf9bb",
  "org.scalablytyped" %%% "sqlite3" % "3.1-dt-20190212Z-33354b",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20190212Z-2f6d0e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        