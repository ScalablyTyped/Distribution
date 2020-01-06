package typings.awsDashSdk.clientsAugmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartHumanLoopRequest extends js.Object {
  /**
    * Attributes of the data specified by the customer.
    */
  var DataAttributes: js.UndefOr[HumanReviewDataAttributes] = js.native
  /**
    * The Amazon Resource Name (ARN) of the flow definition.
    */
  var FlowDefinitionArn: typings.awsDashSdk.clientsAugmentedairuntimeMod.FlowDefinitionArn = js.native
  /**
    * An object containing information about the human loop.
    */
  var HumanLoopInput: HumanLoopInputContent = js.native
  /**
    * The name of the human loop.
    */
  var HumanLoopName: typings.awsDashSdk.clientsAugmentedairuntimeMod.HumanLoopName = js.native
}

object StartHumanLoopRequest {
  @scala.inline
  def apply(
    FlowDefinitionArn: FlowDefinitionArn,
    HumanLoopInput: HumanLoopInputContent,
    HumanLoopName: HumanLoopName,
    DataAttributes: HumanReviewDataAttributes = null
  ): StartHumanLoopRequest = {
    val __obj = js.Dynamic.literal(FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any], HumanLoopInput = HumanLoopInput.asInstanceOf[js.Any], HumanLoopName = HumanLoopName.asInstanceOf[js.Any])
    if (DataAttributes != null) __obj.updateDynamic("DataAttributes")(DataAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartHumanLoopRequest]
  }
}

