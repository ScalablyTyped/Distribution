organization := "com.scalablytyped"
name := "anydb-sql-migrations"
version := "2.2.4-0995d2"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "any-db" % "2.1.0-dt-20181102Z-68ad5f",
  "com.scalablytyped" %%% "any-db-transaction" % "2.2.1-dt-20181102Z-3f0c13",
  "com.scalablytyped" %%% "anydb-sql" % "0.6.57-effb7e",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20181102Z-6d07df",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181109Z-67570f",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "sqlite3" % "3.1-dt-20181102Z-34a951",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "yargs" % "12.0-dt-20181102Z-3cd75b",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        