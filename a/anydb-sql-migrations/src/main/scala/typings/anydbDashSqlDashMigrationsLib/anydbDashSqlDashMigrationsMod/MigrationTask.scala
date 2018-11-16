package typings
package anydbDashSqlDashMigrationsLib.anydbDashSqlDashMigrationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationTask extends js.Object {
  @JSName("down")
  var down_Original: MigFn = js.native
  var name: java.lang.String = js.native
  @JSName("up")
  var up_Original: MigFn = js.native
  def down(tx: anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs.Transaction): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def up(tx: anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs.Transaction): bluebirdLib.bluebirdMod.namespaced[_] = js.native
}

