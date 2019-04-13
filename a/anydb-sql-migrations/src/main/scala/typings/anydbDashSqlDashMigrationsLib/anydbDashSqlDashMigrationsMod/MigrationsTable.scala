package typings
package anydbDashSqlDashMigrationsLib.anydbDashSqlDashMigrationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationsTable
  extends anydbDashSqlLib.anydbDashSqlMod.Table[Migration] {
  var version: anydbDashSqlLib.anydbDashSqlMod.Column[java.lang.String] = js.native
}

