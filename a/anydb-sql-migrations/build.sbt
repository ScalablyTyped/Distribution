organization := "org.scalablytyped"
name := "anydb-sql-migrations"
version := "2.3.1-df018f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "any-db" % "2.1.0-dt-20180910Z-737de3",
  "org.scalablytyped" %%% "any-db-transaction" % "2.2.1-dt-20180910Z-8a47fc",
  "org.scalablytyped" %%% "anydb-sql" % "0.7.0-c5972c",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-98d464",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-e3741e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "sqlite3" % "3.1-dt-20180910Z-b7aca0",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20180929Z-35bbf5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        