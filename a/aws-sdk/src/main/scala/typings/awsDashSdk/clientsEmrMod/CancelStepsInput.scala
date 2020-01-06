package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelStepsInput extends js.Object {
  /**
    * The ClusterID for which specified steps will be canceled. Use RunJobFlow and ListClusters to get ClusterIDs. 
    */
  var ClusterId: XmlStringMaxLen256 = js.native
  /**
    * The option to choose for cancelling RUNNING steps. By default, the value is SEND_INTERRUPT.
    */
  var StepCancellationOption: js.UndefOr[typings.awsDashSdk.clientsEmrMod.StepCancellationOption] = js.native
  /**
    * The list of StepIDs to cancel. Use ListSteps to get steps and their states for the specified cluster.
    */
  var StepIds: StepIdsList = js.native
}

object CancelStepsInput {
  @scala.inline
  def apply(
    ClusterId: XmlStringMaxLen256,
    StepIds: StepIdsList,
    StepCancellationOption: StepCancellationOption = null
  ): CancelStepsInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any], StepIds = StepIds.asInstanceOf[js.Any])
    if (StepCancellationOption != null) __obj.updateDynamic("StepCancellationOption")(StepCancellationOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelStepsInput]
  }
}

