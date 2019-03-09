organization := "org.scalablytyped"
name := "anydb-sql-migrations"
version := "2.4.1-ea78e4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "any-db" % "2.1.0-dt-20180214Z-76e003",
  "org.scalablytyped" %%% "any-db-transaction" % "2.2.1-dt-20180214Z-0017e2",
  "org.scalablytyped" %%% "anydb-sql" % "0.7.1-1644db",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-865309",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190227Z-56553a",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "node-sql-2" % "0.78.0-434dcd",
  "org.scalablytyped" %%% "sqlite3" % "3.1-dt-20190226Z-a403b9",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20190212Z-2f6d0e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        