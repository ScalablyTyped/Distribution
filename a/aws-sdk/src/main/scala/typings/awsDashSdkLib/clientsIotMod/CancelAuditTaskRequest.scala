package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelAuditTaskRequest extends js.Object {
  /**
    * The ID of the audit you want to cancel. You can only cancel an audit that is "IN_PROGRESS".
    */
  var taskId: AuditTaskId
}

object CancelAuditTaskRequest {
  @scala.inline
  def apply(taskId: AuditTaskId): CancelAuditTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId)
  
    __obj.asInstanceOf[CancelAuditTaskRequest]
  }
}

