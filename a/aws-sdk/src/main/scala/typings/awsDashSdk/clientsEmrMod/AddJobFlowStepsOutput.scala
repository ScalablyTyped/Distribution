package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddJobFlowStepsOutput extends js.Object {
  /**
    * The identifiers of the list of steps added to the job flow.
    */
  var StepIds: js.UndefOr[StepIdsList] = js.native
}

object AddJobFlowStepsOutput {
  @scala.inline
  def apply(StepIds: StepIdsList = null): AddJobFlowStepsOutput = {
    val __obj = js.Dynamic.literal()
    if (StepIds != null) __obj.updateDynamic("StepIds")(StepIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddJobFlowStepsOutput]
  }
}

