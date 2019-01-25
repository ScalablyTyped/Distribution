organization := "org.scalablytyped"
name := "anydb-sql-migrations"
version := "2.4.1-fa36a0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "any-db" % "2.1.0-dt-20180214Z-c3d7f0",
  "org.scalablytyped" %%% "any-db-transaction" % "2.2.1-dt-20180214Z-24335c",
  "org.scalablytyped" %%% "anydb-sql" % "0.7.1-8885d2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-232ecf",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-c48db4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "node-sql-2" % "0.78.0-f13111",
  "org.scalablytyped" %%% "sqlite3" % "3.1-dt-20180322Z-dc8773",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20190124Z-7f6a8f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        