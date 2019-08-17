package typings.anydbDashSqlDashMigrations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object anydbDashSqlDashMigrationsMod {
  import typings.anydbDashSql.anydbDashSqlMod.Transaction

  type MigFn = js.Function1[/* tx */ Transaction, typings.bluebird.bluebirdMod.^[js.Any]]
}
