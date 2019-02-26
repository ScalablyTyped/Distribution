organization := "org.scalablytyped"
name := "anydb-sql-migrations"
version := "2.4.1-5900f8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "any-db" % "2.1.0-dt-20180214Z-3a04b2",
  "org.scalablytyped" %%% "any-db-transaction" % "2.2.1-dt-20180214Z-2054dc",
  "org.scalablytyped" %%% "anydb-sql" % "0.7.1-7f6fdc",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-04358d",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-cf3a73",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "node-sql-2" % "0.78.0-b99f4c",
  "org.scalablytyped" %%% "sqlite3" % "3.1-dt-20190212Z-791d07",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20190212Z-31d9dc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        