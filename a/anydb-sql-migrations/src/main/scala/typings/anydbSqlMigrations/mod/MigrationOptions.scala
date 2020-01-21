package typings.anydbSqlMigrations.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationOptions extends js.Object {
  var check: js.UndefOr[Boolean] = js.undefined
  var drop: js.UndefOr[Boolean] = js.undefined
  var execute: js.UndefOr[Boolean] = js.undefined
  var rollback: js.UndefOr[Boolean] = js.undefined
}

object MigrationOptions {
  @scala.inline
  def apply(
    check: js.UndefOr[Boolean] = js.undefined,
    drop: js.UndefOr[Boolean] = js.undefined,
    execute: js.UndefOr[Boolean] = js.undefined,
    rollback: js.UndefOr[Boolean] = js.undefined
  ): MigrationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(check)) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (!js.isUndefined(drop)) __obj.updateDynamic("drop")(drop.asInstanceOf[js.Any])
    if (!js.isUndefined(execute)) __obj.updateDynamic("execute")(execute.asInstanceOf[js.Any])
    if (!js.isUndefined(rollback)) __obj.updateDynamic("rollback")(rollback.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationOptions]
  }
}

