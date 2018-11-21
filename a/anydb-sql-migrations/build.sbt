organization := "com.scalablytyped"
name := "anydb-sql-migrations"
version := "2.2.4-17d640"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "any-db" % "2.1.0-dt-20180910Z-56ecca",
  "com.scalablytyped" %%% "any-db-transaction" % "2.2.1-dt-20180910Z-d96e1d",
  "com.scalablytyped" %%% "anydb-sql" % "0.6.57-a34bd7",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-3124ce",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-caf0c5",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "sqlite3" % "3.1-dt-20180910Z-74cb9c",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "yargs" % "12.0-dt-20180929Z-7a332c",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        