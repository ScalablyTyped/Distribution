package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lifecycle extends js.Object {
  /**
    * Specifies the number of days after creation that a recovery point is deleted. Must be greater than MoveToColdStorageAfterDays.
    */
  var DeleteAfterDays: js.UndefOr[Long] = js.undefined
  /**
    * Specifies the number of days after creation that a recovery point is moved to cold storage.
    */
  var MoveToColdStorageAfterDays: js.UndefOr[Long] = js.undefined
}

object Lifecycle {
  @scala.inline
  def apply(
    DeleteAfterDays: js.UndefOr[Long] = js.undefined,
    MoveToColdStorageAfterDays: js.UndefOr[Long] = js.undefined
  ): Lifecycle = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DeleteAfterDays)) __obj.updateDynamic("DeleteAfterDays")(DeleteAfterDays)
    if (!js.isUndefined(MoveToColdStorageAfterDays)) __obj.updateDynamic("MoveToColdStorageAfterDays")(MoveToColdStorageAfterDays)
    __obj.asInstanceOf[Lifecycle]
  }
}

