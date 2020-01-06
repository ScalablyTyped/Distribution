package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkflowExecutionInput extends js.Object {
  /**
    * The name of the domain containing the workflow execution.
    */
  var domain: DomainName = js.native
  /**
    * The workflow execution to describe.
    */
  var execution: WorkflowExecution = js.native
}

object DescribeWorkflowExecutionInput {
  @scala.inline
  def apply(domain: DomainName, execution: WorkflowExecution): DescribeWorkflowExecutionInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], execution = execution.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeWorkflowExecutionInput]
  }
}

