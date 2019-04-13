package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowStepFunctionsParameters extends js.Object {
  /**
    * The inputs for the STEP_FUNCTION task.
    */
  var Input: js.UndefOr[MaintenanceWindowStepFunctionsInput] = js.undefined
  /**
    * The name of the STEP_FUNCTION task.
    */
  var Name: js.UndefOr[MaintenanceWindowStepFunctionsName] = js.undefined
}

object MaintenanceWindowStepFunctionsParameters {
  @scala.inline
  def apply(Input: MaintenanceWindowStepFunctionsInput = null, Name: MaintenanceWindowStepFunctionsName = null): MaintenanceWindowStepFunctionsParameters = {
    val __obj = js.Dynamic.literal()
    if (Input != null) __obj.updateDynamic("Input")(Input)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[MaintenanceWindowStepFunctionsParameters]
  }
}

