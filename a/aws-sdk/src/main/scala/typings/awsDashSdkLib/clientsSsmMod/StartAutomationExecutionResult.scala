package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartAutomationExecutionResult extends js.Object {
  /**
    * The unique ID of a newly scheduled automation execution.
    */
  var AutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.undefined
}

object StartAutomationExecutionResult {
  @scala.inline
  def apply(AutomationExecutionId: AutomationExecutionId = null): StartAutomationExecutionResult = {
    val __obj = js.Dynamic.literal()
    if (AutomationExecutionId != null) __obj.updateDynamic("AutomationExecutionId")(AutomationExecutionId)
    __obj.asInstanceOf[StartAutomationExecutionResult]
  }
}

