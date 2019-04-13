package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelingJobStoppingConditions extends js.Object {
  /**
    * The maximum number of objects that can be labeled by human workers.
    */
  var MaxHumanLabeledObjectCount: js.UndefOr[MaxHumanLabeledObjectCount] = js.undefined
  /**
    * The maximum number of input data objects that should be labeled.
    */
  var MaxPercentageOfInputDatasetLabeled: js.UndefOr[MaxPercentageOfInputDatasetLabeled] = js.undefined
}

object LabelingJobStoppingConditions {
  @scala.inline
  def apply(
    MaxHumanLabeledObjectCount: js.UndefOr[MaxHumanLabeledObjectCount] = js.undefined,
    MaxPercentageOfInputDatasetLabeled: js.UndefOr[MaxPercentageOfInputDatasetLabeled] = js.undefined
  ): LabelingJobStoppingConditions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxHumanLabeledObjectCount)) __obj.updateDynamic("MaxHumanLabeledObjectCount")(MaxHumanLabeledObjectCount)
    if (!js.isUndefined(MaxPercentageOfInputDatasetLabeled)) __obj.updateDynamic("MaxPercentageOfInputDatasetLabeled")(MaxPercentageOfInputDatasetLabeled)
    __obj.asInstanceOf[LabelingJobStoppingConditions]
  }
}

