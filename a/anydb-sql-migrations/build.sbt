organization := "org.scalablytyped"
name := "anydb-sql-migrations"
version := "2.3.1-48150f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "any-db" % "2.1.0-dt-20180910Z-2ce495",
  "org.scalablytyped" %%% "any-db-transaction" % "2.2.1-dt-20180910Z-7c3bf6",
  "org.scalablytyped" %%% "anydb-sql" % "0.7.0-e59f93",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-b88fdf",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "sqlite3" % "3.1-dt-20180910Z-b50df3",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20180929Z-5bb344")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        