package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAuditTaskRequest extends js.Object {
  /**
    * The ID of the audit whose information you want to get.
    */
  var taskId: AuditTaskId
}

object DescribeAuditTaskRequest {
  @scala.inline
  def apply(taskId: AuditTaskId): DescribeAuditTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId)
  
    __obj.asInstanceOf[DescribeAuditTaskRequest]
  }
}

