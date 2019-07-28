package typings.anydbDashSqlDashMigrations.anydbDashSqlDashMigrationsMod

import typings.anydbDashSql.anydbDashSqlMod.Column
import typings.anydbDashSql.anydbDashSqlMod.Table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationsTable extends Table[Migration] {
  var version: Column[String] = js.native
}

