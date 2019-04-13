package typings
package awsDashSdkLib.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduleKeyDeletionResponse extends js.Object {
  /**
    * The date and time after which AWS KMS deletes the customer master key (CMK).
    */
  var DeletionDate: js.UndefOr[DateType] = js.undefined
  /**
    * The unique identifier of the customer master key (CMK) for which deletion is scheduled.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
}

object ScheduleKeyDeletionResponse {
  @scala.inline
  def apply(DeletionDate: DateType = null, KeyId: KeyIdType = null): ScheduleKeyDeletionResponse = {
    val __obj = js.Dynamic.literal()
    if (DeletionDate != null) __obj.updateDynamic("DeletionDate")(DeletionDate)
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId)
    __obj.asInstanceOf[ScheduleKeyDeletionResponse]
  }
}

