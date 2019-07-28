package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeWorkflowTypeInput extends js.Object {
  /**
    * The name of the domain in which this workflow type is registered.
    */
  var domain: DomainName
  /**
    * The workflow type to describe.
    */
  var workflowType: WorkflowType
}

object DescribeWorkflowTypeInput {
  @scala.inline
  def apply(domain: DomainName, workflowType: WorkflowType): DescribeWorkflowTypeInput = {
    val __obj = js.Dynamic.literal(domain = domain, workflowType = workflowType)
  
    __obj.asInstanceOf[DescribeWorkflowTypeInput]
  }
}

