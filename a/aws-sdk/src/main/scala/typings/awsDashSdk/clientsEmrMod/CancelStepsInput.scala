package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelStepsInput extends js.Object {
  /**
    * The ClusterID for which specified steps will be canceled. Use RunJobFlow and ListClusters to get ClusterIDs. 
    */
  var ClusterId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  /**
    * The list of StepIDs to cancel. Use ListSteps to get steps and their states for the specified cluster.
    */
  var StepIds: js.UndefOr[StepIdsList] = js.undefined
}

object CancelStepsInput {
  @scala.inline
  def apply(ClusterId: XmlStringMaxLen256 = null, StepIds: StepIdsList = null): CancelStepsInput = {
    val __obj = js.Dynamic.literal()
    if (ClusterId != null) __obj.updateDynamic("ClusterId")(ClusterId)
    if (StepIds != null) __obj.updateDynamic("StepIds")(StepIds)
    __obj.asInstanceOf[CancelStepsInput]
  }
}

