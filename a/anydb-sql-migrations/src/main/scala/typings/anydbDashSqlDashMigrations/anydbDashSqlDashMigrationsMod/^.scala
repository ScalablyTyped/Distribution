package typings.anydbDashSqlDashMigrations.anydbDashSqlDashMigrationsMod

import typings.anydbDashSql.anydbDashSqlMod.AnydbSql
import typings.anydbDashSqlDashMigrations.Anon_Check
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("anydb-sql-migrations", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def create(db: AnydbSql, tasks: String): Anon_Check = js.native
  def create(db: AnydbSql, tasks: js.Array[MigrationTask]): Anon_Check = js.native
}

