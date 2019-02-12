organization := "org.scalablytyped"
name := "anydb-sql-migrations"
version := "2.4.1-305c17"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "any-db" % "2.1.0-dt-20180214Z-a2d5c4",
  "org.scalablytyped" %%% "any-db-transaction" % "2.2.1-dt-20180214Z-3a3822",
  "org.scalablytyped" %%% "anydb-sql" % "0.7.1-7ea22f",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-f01776",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-cf3a73",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "node-sql-2" % "0.78.0-c8f5cb",
  "org.scalablytyped" %%% "sqlite3" % "3.1-dt-20180322Z-de5100",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20190124Z-31d9dc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        