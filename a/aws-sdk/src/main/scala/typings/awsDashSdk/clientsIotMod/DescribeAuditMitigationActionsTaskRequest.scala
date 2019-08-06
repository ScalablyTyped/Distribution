package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAuditMitigationActionsTaskRequest extends js.Object {
  /**
    * The unique identifier for the audit mitigation task.
    */
  var taskId: AuditMitigationActionsTaskId
}

object DescribeAuditMitigationActionsTaskRequest {
  @scala.inline
  def apply(taskId: AuditMitigationActionsTaskId): DescribeAuditMitigationActionsTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId)
  
    __obj.asInstanceOf[DescribeAuditMitigationActionsTaskRequest]
  }
}

