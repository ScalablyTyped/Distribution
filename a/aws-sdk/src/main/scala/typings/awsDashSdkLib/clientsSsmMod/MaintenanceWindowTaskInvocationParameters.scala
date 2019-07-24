package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowTaskInvocationParameters extends js.Object {
  /**
    * The parameters for an AUTOMATION task type.
    */
  var Automation: js.UndefOr[MaintenanceWindowAutomationParameters] = js.undefined
  /**
    * The parameters for a LAMBDA task type.
    */
  var Lambda: js.UndefOr[MaintenanceWindowLambdaParameters] = js.undefined
  /**
    * The parameters for a RUN_COMMAND task type.
    */
  var RunCommand: js.UndefOr[MaintenanceWindowRunCommandParameters] = js.undefined
  /**
    * The parameters for a STEP_FUNCTIONS task type.
    */
  var StepFunctions: js.UndefOr[MaintenanceWindowStepFunctionsParameters] = js.undefined
}

object MaintenanceWindowTaskInvocationParameters {
  @scala.inline
  def apply(
    Automation: MaintenanceWindowAutomationParameters = null,
    Lambda: MaintenanceWindowLambdaParameters = null,
    RunCommand: MaintenanceWindowRunCommandParameters = null,
    StepFunctions: MaintenanceWindowStepFunctionsParameters = null
  ): MaintenanceWindowTaskInvocationParameters = {
    val __obj = js.Dynamic.literal()
    if (Automation != null) __obj.updateDynamic("Automation")(Automation)
    if (Lambda != null) __obj.updateDynamic("Lambda")(Lambda)
    if (RunCommand != null) __obj.updateDynamic("RunCommand")(RunCommand)
    if (StepFunctions != null) __obj.updateDynamic("StepFunctions")(StepFunctions)
    __obj.asInstanceOf[MaintenanceWindowTaskInvocationParameters]
  }
}

