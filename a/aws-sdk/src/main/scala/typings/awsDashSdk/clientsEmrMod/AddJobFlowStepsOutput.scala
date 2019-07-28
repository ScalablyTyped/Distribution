package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddJobFlowStepsOutput extends js.Object {
  /**
    * The identifiers of the list of steps added to the job flow.
    */
  var StepIds: js.UndefOr[StepIdsList] = js.undefined
}

object AddJobFlowStepsOutput {
  @scala.inline
  def apply(StepIds: StepIdsList = null): AddJobFlowStepsOutput = {
    val __obj = js.Dynamic.literal()
    if (StepIds != null) __obj.updateDynamic("StepIds")(StepIds)
    __obj.asInstanceOf[AddJobFlowStepsOutput]
  }
}

