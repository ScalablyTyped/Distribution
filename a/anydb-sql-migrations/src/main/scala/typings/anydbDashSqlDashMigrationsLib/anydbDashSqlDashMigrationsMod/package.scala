package typings
package anydbDashSqlDashMigrationsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object anydbDashSqlDashMigrationsMod {
  type MigFn = js.Function1[
    /* tx */ anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs.Transaction, 
    bluebirdLib.bluebirdMod.namespaced[js.Any]
  ]
}
