package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeprecateWorkflowTypeInput extends js.Object {
  /**
    * The name of the domain in which the workflow type is registered.
    */
  var domain: DomainName
  /**
    * The workflow type to deprecate.
    */
  var workflowType: WorkflowType
}

object DeprecateWorkflowTypeInput {
  @scala.inline
  def apply(domain: DomainName, workflowType: WorkflowType): DeprecateWorkflowTypeInput = {
    val __obj = js.Dynamic.literal(domain = domain, workflowType = workflowType)
  
    __obj.asInstanceOf[DeprecateWorkflowTypeInput]
  }
}

