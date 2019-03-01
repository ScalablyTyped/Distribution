package typings
package anydbDashSqlDashMigrationsLib.anydbDashSqlDashMigrationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationOptions extends js.Object {
  var check: js.UndefOr[scala.Boolean] = js.undefined
  var drop: js.UndefOr[scala.Boolean] = js.undefined
  var execute: js.UndefOr[scala.Boolean] = js.undefined
  var rollback: js.UndefOr[scala.Boolean] = js.undefined
}

object MigrationOptions {
  @scala.inline
  def apply(
    check: js.UndefOr[scala.Boolean] = js.undefined,
    drop: js.UndefOr[scala.Boolean] = js.undefined,
    execute: js.UndefOr[scala.Boolean] = js.undefined,
    rollback: js.UndefOr[scala.Boolean] = js.undefined
  ): MigrationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(check)) __obj.updateDynamic("check")(check)
    if (!js.isUndefined(drop)) __obj.updateDynamic("drop")(drop)
    if (!js.isUndefined(execute)) __obj.updateDynamic("execute")(execute)
    if (!js.isUndefined(rollback)) __obj.updateDynamic("rollback")(rollback)
    __obj.asInstanceOf[MigrationOptions]
  }
}

