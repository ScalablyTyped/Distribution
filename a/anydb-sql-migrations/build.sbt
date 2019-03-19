organization := "org.scalablytyped"
name := "anydb-sql-migrations"
version := "2.4.1-4daff3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "any-db" % "2.1.0-dt-20180214Z-0b6b41",
  "org.scalablytyped" %%% "any-db-transaction" % "2.2.1-dt-20180214Z-e537f4",
  "org.scalablytyped" %%% "anydb-sql" % "0.7.1-d8438d",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-cc7043",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190318Z-f6d9fe",
  "org.scalablytyped" %%% "node-sql-2" % "0.78.0-04c0e9",
  "org.scalablytyped" %%% "sqlite3" % "3.1-dt-20190226Z-4b0d05",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20190317Z-d1d847")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        