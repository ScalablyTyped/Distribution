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
  def apply(DeleteAfterDays: Int | Double = null, MoveToColdStorageAfterDays: Int | Double = null): Lifecycle = {
    val __obj = js.Dynamic.literal()
    if (DeleteAfterDays != null) __obj.updateDynamic("DeleteAfterDays")(DeleteAfterDays.asInstanceOf[js.Any])
    if (MoveToColdStorageAfterDays != null) __obj.updateDynamic("MoveToColdStorageAfterDays")(MoveToColdStorageAfterDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lifecycle]
  }
}

