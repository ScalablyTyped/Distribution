organization := "com.scalablytyped"
name := "anydb-sql-migrations"
version := "2.2.4-4d6c5d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "any-db" % "2.1.0-dt-20180910Z-199c2f",
  "com.scalablytyped" %%% "any-db-transaction" % "2.2.1-dt-20180910Z-5591db",
  "com.scalablytyped" %%% "anydb-sql" % "0.6.57-ddb0a2",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-3124ce",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-caf0c5",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "sqlite3" % "3.1-dt-20180910Z-47eaa3",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "yargs" % "12.0-dt-20180929Z-7a332c",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        