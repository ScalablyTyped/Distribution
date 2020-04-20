package typings.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartHumanLoopRequest extends js.Object {
  /**
    * Attributes of the specified data. Use DataAttributes to specify if your data is free of personally identifiable information and/or free of adult content.
    */
  var DataAttributes: js.UndefOr[HumanLoopDataAttributes] = js.native
  /**
    * The Amazon Resource Name (ARN) of the flow definition associated with this human loop.
    */
  var FlowDefinitionArn: typings.awsSdk.augmentedairuntimeMod.FlowDefinitionArn = js.native
  /**
    * An object that contains information about the human loop.
    */
  var HumanLoopInput: typings.awsSdk.augmentedairuntimeMod.HumanLoopInput = js.native
  /**
    * The name of the human loop.
    */
  var HumanLoopName: typings.awsSdk.augmentedairuntimeMod.HumanLoopName = js.native
}

object StartHumanLoopRequest {
  @scala.inline
  def apply(
    FlowDefinitionArn: FlowDefinitionArn,
    HumanLoopInput: HumanLoopInput,
    HumanLoopName: HumanLoopName,
    DataAttributes: HumanLoopDataAttributes = null
  ): StartHumanLoopRequest = {
    val __obj = js.Dynamic.literal(FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any], HumanLoopInput = HumanLoopInput.asInstanceOf[js.Any], HumanLoopName = HumanLoopName.asInstanceOf[js.Any])
    if (DataAttributes != null) __obj.updateDynamic("DataAttributes")(DataAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartHumanLoopRequest]
  }
}

