organization := "org.scalablytyped"
name := "anydb-sql-migrations"
version := "2.4.1-d6a017"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "any-db" % "2.1.0-dt-20190322Z-a11d0b",
  "org.scalablytyped" %%% "any-db-transaction" % "2.2.1-dt-20190322Z-80b8ef",
  "org.scalablytyped" %%% "anydb-sql" % "0.7.1-582ae9",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-986805",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190329Z-69a948",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "node-sql-2" % "0.78.0-7d661a",
  "org.scalablytyped" %%% "sqlite3" % "3.1-dt-20190226Z-567e1b",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20190317Z-96d20e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        