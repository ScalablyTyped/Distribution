package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelAuditMitigationActionsTaskRequest extends js.Object {
  /**
    * The unique identifier for the task that you want to cancel. 
    */
  var taskId: AuditMitigationActionsTaskId
}

object CancelAuditMitigationActionsTaskRequest {
  @scala.inline
  def apply(taskId: AuditMitigationActionsTaskId): CancelAuditMitigationActionsTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId)
  
    __obj.asInstanceOf[CancelAuditMitigationActionsTaskRequest]
  }
}

