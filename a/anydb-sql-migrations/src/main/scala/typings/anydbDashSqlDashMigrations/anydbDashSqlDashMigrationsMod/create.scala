package typings.anydbDashSqlDashMigrations.anydbDashSqlDashMigrationsMod

import typings.anydbDashSql.anydbDashSqlMod.AnydbSql
import typings.anydbDashSqlDashMigrations.Anon_Check
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("anydb-sql-migrations", "create")
@js.native
object create extends js.Object {
  def apply(db: AnydbSql, tasks: String): Anon_Check = js.native
  def apply(db: AnydbSql, tasks: js.Array[MigrationTask]): Anon_Check = js.native
}

