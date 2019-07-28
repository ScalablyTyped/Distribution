package typings.anydbDashSqlDashMigrations

import typings.anydbDashSql.anydbDashSqlMod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object anydbDashSqlDashMigrationsMod {
  type MigFn = js.Function1[/* tx */ Transaction, typings.bluebird.bluebirdMod.^[js.Any]]
}
