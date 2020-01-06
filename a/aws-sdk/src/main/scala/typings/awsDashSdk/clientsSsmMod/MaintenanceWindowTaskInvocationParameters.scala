package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowTaskInvocationParameters extends js.Object {
  /**
    * The parameters for an AUTOMATION task type.
    */
  var Automation: js.UndefOr[MaintenanceWindowAutomationParameters] = js.native
  /**
    * The parameters for a LAMBDA task type.
    */
  var Lambda: js.UndefOr[MaintenanceWindowLambdaParameters] = js.native
  /**
    * The parameters for a RUN_COMMAND task type.
    */
  var RunCommand: js.UndefOr[MaintenanceWindowRunCommandParameters] = js.native
  /**
    * The parameters for a STEP_FUNCTIONS task type.
    */
  var StepFunctions: js.UndefOr[MaintenanceWindowStepFunctionsParameters] = js.native
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
    if (Automation != null) __obj.updateDynamic("Automation")(Automation.asInstanceOf[js.Any])
    if (Lambda != null) __obj.updateDynamic("Lambda")(Lambda.asInstanceOf[js.Any])
    if (RunCommand != null) __obj.updateDynamic("RunCommand")(RunCommand.asInstanceOf[js.Any])
    if (StepFunctions != null) __obj.updateDynamic("StepFunctions")(StepFunctions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTaskInvocationParameters]
  }
}

