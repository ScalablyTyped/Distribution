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
  def apply(FlowDefinitionArn: FlowDefinitionArn, HumanLoopInput: HumanLoopInput, HumanLoopName: HumanLoopName): StartHumanLoopRequest = {
    val __obj = js.Dynamic.literal(FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any], HumanLoopInput = HumanLoopInput.asInstanceOf[js.Any], HumanLoopName = HumanLoopName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartHumanLoopRequest]
  }
  @scala.inline
  implicit class StartHumanLoopRequestOps[Self <: StartHumanLoopRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFlowDefinitionArn(value: FlowDefinitionArn): Self = this.set("FlowDefinitionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setHumanLoopInput(value: HumanLoopInput): Self = this.set("HumanLoopInput", value.asInstanceOf[js.Any])
    @scala.inline
    def setHumanLoopName(value: HumanLoopName): Self = this.set("HumanLoopName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataAttributes(value: HumanLoopDataAttributes): Self = this.set("DataAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataAttributes: Self = this.set("DataAttributes", js.undefined)
  }
  
}

