package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceLinkedRoleDeletionStatusResponse extends js.Object {
  /**
    * An object that contains details about the reason the deletion failed.
    */
  var Reason: js.UndefOr[DeletionTaskFailureReasonType] = js.undefined
  /**
    * The status of the deletion.
    */
  var Status: DeletionTaskStatusType
}

object GetServiceLinkedRoleDeletionStatusResponse {
  @scala.inline
  def apply(Status: DeletionTaskStatusType, Reason: DeletionTaskFailureReasonType = null): GetServiceLinkedRoleDeletionStatusResponse = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    if (Reason != null) __obj.updateDynamic("Reason")(Reason)
    __obj.asInstanceOf[GetServiceLinkedRoleDeletionStatusResponse]
  }
}

