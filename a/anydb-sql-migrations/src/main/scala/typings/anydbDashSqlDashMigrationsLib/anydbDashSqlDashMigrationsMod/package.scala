package typings
package anydbDashSqlDashMigrationsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object anydbDashSqlDashMigrationsMod {
  type MigFn = js.Function1[
    /* tx */ anydbDashSqlLib.anydbDashSqlMod.Transaction, 
    bluebirdLib.bluebirdMod.^[js.Any]
  ]
}
