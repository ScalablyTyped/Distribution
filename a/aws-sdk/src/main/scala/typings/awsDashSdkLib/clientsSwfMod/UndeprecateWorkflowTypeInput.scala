package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UndeprecateWorkflowTypeInput extends js.Object {
  /**
    * The name of the domain of the deprecated workflow type.
    */
  var domain: DomainName
  /**
    * The name of the domain of the deprecated workflow type.
    */
  var workflowType: WorkflowType
}

object UndeprecateWorkflowTypeInput {
  @scala.inline
  def apply(domain: DomainName, workflowType: WorkflowType): UndeprecateWorkflowTypeInput = {
    val __obj = js.Dynamic.literal(domain = domain, workflowType = workflowType)
  
    __obj.asInstanceOf[UndeprecateWorkflowTypeInput]
  }
}

