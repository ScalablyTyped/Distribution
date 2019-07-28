package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeWorkflowExecutionInput extends js.Object {
  /**
    * The name of the domain containing the workflow execution.
    */
  var domain: DomainName
  /**
    * The workflow execution to describe.
    */
  var execution: WorkflowExecution
}

object DescribeWorkflowExecutionInput {
  @scala.inline
  def apply(domain: DomainName, execution: WorkflowExecution): DescribeWorkflowExecutionInput = {
    val __obj = js.Dynamic.literal(domain = domain, execution = execution)
  
    __obj.asInstanceOf[DescribeWorkflowExecutionInput]
  }
}

