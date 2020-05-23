package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lifecycle extends js.Object {
  /**
    * Specifies the number of days after creation that a recovery point is deleted. Must be greater than 90 days plus MoveToColdStorageAfterDays.
    */
  var DeleteAfterDays: js.UndefOr[Long_] = js.native
  /**
    * Specifies the number of days after creation that a recovery point is moved to cold storage.
    */
  var MoveToColdStorageAfterDays: js.UndefOr[Long_] = js.native
}

object Lifecycle {
  @scala.inline
  def apply(
    DeleteAfterDays: js.UndefOr[Long_] = js.undefined,
    MoveToColdStorageAfterDays: js.UndefOr[Long_] = js.undefined
  ): Lifecycle = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DeleteAfterDays)) __obj.updateDynamic("DeleteAfterDays")(DeleteAfterDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MoveToColdStorageAfterDays)) __obj.updateDynamic("MoveToColdStorageAfterDays")(MoveToColdStorageAfterDays.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lifecycle]
  }
}

