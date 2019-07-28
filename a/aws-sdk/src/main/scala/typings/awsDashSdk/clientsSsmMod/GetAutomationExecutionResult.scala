package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAutomationExecutionResult extends js.Object {
  /**
    * Detailed information about the current state of an automation execution.
    */
  var AutomationExecution: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AutomationExecution] = js.undefined
}

object GetAutomationExecutionResult {
  @scala.inline
  def apply(AutomationExecution: AutomationExecution = null): GetAutomationExecutionResult = {
    val __obj = js.Dynamic.literal()
    if (AutomationExecution != null) __obj.updateDynamic("AutomationExecution")(AutomationExecution)
    __obj.asInstanceOf[GetAutomationExecutionResult]
  }
}

