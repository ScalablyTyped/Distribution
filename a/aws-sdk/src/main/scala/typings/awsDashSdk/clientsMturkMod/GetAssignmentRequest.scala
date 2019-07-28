package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAssignmentRequest extends js.Object {
  /**
    * The ID of the Assignment to be retrieved.
    */
  var AssignmentId: EntityId
}

object GetAssignmentRequest {
  @scala.inline
  def apply(AssignmentId: EntityId): GetAssignmentRequest = {
    val __obj = js.Dynamic.literal(AssignmentId = AssignmentId)
  
    __obj.asInstanceOf[GetAssignmentRequest]
  }
}

