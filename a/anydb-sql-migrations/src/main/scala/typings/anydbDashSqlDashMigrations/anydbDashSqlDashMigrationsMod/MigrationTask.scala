package typings.anydbDashSqlDashMigrations.anydbDashSqlDashMigrationsMod

import typings.anydbDashSql.anydbDashSqlMod.Transaction
import typings.bluebird.bluebirdMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationTask extends js.Object {
  @JSName("down")
  var down_Original: MigFn = js.native
  var name: String = js.native
  @JSName("up")
  var up_Original: MigFn = js.native
  def down(tx: Transaction): ^[_] = js.native
  def up(tx: Transaction): ^[_] = js.native
}

