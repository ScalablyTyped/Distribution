organization := "org.scalablytyped"
name := "anydb-sql-migrations"
version := "2.4.1-2887f2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "any-db" % "2.1.0-dt-20180214Z-b62f29",
  "org.scalablytyped" %%% "any-db-transaction" % "2.2.1-dt-20180214Z-668fdf",
  "org.scalablytyped" %%% "anydb-sql" % "0.7.1-116359",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-ef7d03",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-e5b16b",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "node-sql-2" % "0.78.0-b78ca3",
  "org.scalablytyped" %%% "sqlite3" % "3.1-dt-20180322Z-33f30f",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20190124Z-edd14a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        