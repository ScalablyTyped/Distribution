package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopAutomationExecutionRequest extends js.Object {
  /**
    * The execution ID of the Automation to stop.
    */
  var AutomationExecutionId: typings.awsDashSdk.clientsSsmMod.AutomationExecutionId
  /**
    * The stop request type. Valid types include the following: Cancel and Complete. The default type is Cancel.
    */
  var Type: js.UndefOr[StopType] = js.undefined
}

object StopAutomationExecutionRequest {
  @scala.inline
  def apply(AutomationExecutionId: AutomationExecutionId, Type: StopType = null): StopAutomationExecutionRequest = {
    val __obj = js.Dynamic.literal(AutomationExecutionId = AutomationExecutionId)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopAutomationExecutionRequest]
  }
}

