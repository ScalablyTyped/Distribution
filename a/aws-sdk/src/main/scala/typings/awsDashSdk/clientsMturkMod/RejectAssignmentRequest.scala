package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RejectAssignmentRequest extends js.Object {
  /**
    *  The ID of the assignment. The assignment must correspond to a HIT created by the Requester. 
    */
  var AssignmentId: EntityId = js.native
  /**
    *  A message for the Worker, which the Worker can see in the Status section of the web site. 
    */
  var RequesterFeedback: String = js.native
}

object RejectAssignmentRequest {
  @scala.inline
  def apply(AssignmentId: EntityId, RequesterFeedback: String): RejectAssignmentRequest = {
    val __obj = js.Dynamic.literal(AssignmentId = AssignmentId.asInstanceOf[js.Any], RequesterFeedback = RequesterFeedback.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RejectAssignmentRequest]
  }
}

