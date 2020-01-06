package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFlowDefinitionRequest extends js.Object {
  /**
    * The name of the flow definition you are deleting.
    */
  var FlowDefinitionName: typings.awsDashSdk.clientsSagemakerMod.FlowDefinitionName = js.native
}

object DeleteFlowDefinitionRequest {
  @scala.inline
  def apply(FlowDefinitionName: FlowDefinitionName): DeleteFlowDefinitionRequest = {
    val __obj = js.Dynamic.literal(FlowDefinitionName = FlowDefinitionName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteFlowDefinitionRequest]
  }
}

