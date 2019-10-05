package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApproveAssignmentRequest extends js.Object {
  /**
    *  The ID of the assignment. The assignment must correspond to a HIT created by the Requester. 
    */
  var AssignmentId: EntityId
  /**
    *  A flag indicating that an assignment should be approved even if it was previously rejected. Defaults to False. 
    */
  var OverrideRejection: js.UndefOr[Boolean] = js.undefined
  /**
    *  A message for the Worker, which the Worker can see in the Status section of the web site. 
    */
  var RequesterFeedback: js.UndefOr[String] = js.undefined
}

object ApproveAssignmentRequest {
  @scala.inline
  def apply(
    AssignmentId: EntityId,
    OverrideRejection: js.UndefOr[scala.Boolean] = js.undefined,
    RequesterFeedback: String = null
  ): ApproveAssignmentRequest = {
    val __obj = js.Dynamic.literal(AssignmentId = AssignmentId)
    if (!js.isUndefined(OverrideRejection)) __obj.updateDynamic("OverrideRejection")(OverrideRejection)
    if (RequesterFeedback != null) __obj.updateDynamic("RequesterFeedback")(RequesterFeedback)
    __obj.asInstanceOf[ApproveAssignmentRequest]
  }
}

