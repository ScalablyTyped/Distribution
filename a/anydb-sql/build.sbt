organization := "org.scalablytyped"
name := "anydb-sql"
version := "0.7.1-36be4b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "any-db" % "2.1.0-dt-20180214Z-1d4b29",
  "org.scalablytyped" %%% "any-db-transaction" % "2.2.1-dt-20180214Z-4825d6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-cc7043",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190320Z-26b6b7",
  "org.scalablytyped" %%% "node-sql-2" % "0.78.0-04c0e9",
  "org.scalablytyped" %%% "sqlite3" % "3.1-dt-20190226Z-84dc78",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        