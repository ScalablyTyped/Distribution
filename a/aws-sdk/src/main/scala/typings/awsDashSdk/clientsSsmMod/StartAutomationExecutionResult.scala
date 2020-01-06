package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartAutomationExecutionResult extends js.Object {
  /**
    * The unique ID of a newly scheduled automation execution.
    */
  var AutomationExecutionId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AutomationExecutionId] = js.native
}

object StartAutomationExecutionResult {
  @scala.inline
  def apply(AutomationExecutionId: AutomationExecutionId = null): StartAutomationExecutionResult = {
    val __obj = js.Dynamic.literal()
    if (AutomationExecutionId != null) __obj.updateDynamic("AutomationExecutionId")(AutomationExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartAutomationExecutionResult]
  }
}

