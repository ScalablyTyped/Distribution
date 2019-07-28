package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowExecutionFilter extends js.Object {
  /**
    * The workflowId to pass of match the criteria of this filter.
    */
  var workflowId: WorkflowId
}

object WorkflowExecutionFilter {
  @scala.inline
  def apply(workflowId: WorkflowId): WorkflowExecutionFilter = {
    val __obj = js.Dynamic.literal(workflowId = workflowId)
  
    __obj.asInstanceOf[WorkflowExecutionFilter]
  }
}

