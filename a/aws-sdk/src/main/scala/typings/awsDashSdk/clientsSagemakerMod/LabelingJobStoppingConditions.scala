package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelingJobStoppingConditions extends js.Object {
  /**
    * The maximum number of objects that can be labeled by human workers.
    */
  var MaxHumanLabeledObjectCount: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.MaxHumanLabeledObjectCount] = js.undefined
  /**
    * The maximum number of input data objects that should be labeled.
    */
  var MaxPercentageOfInputDatasetLabeled: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.MaxPercentageOfInputDatasetLabeled] = js.undefined
}

object LabelingJobStoppingConditions {
  @scala.inline
  def apply(
    MaxHumanLabeledObjectCount: Int | Double = null,
    MaxPercentageOfInputDatasetLabeled: Int | Double = null
  ): LabelingJobStoppingConditions = {
    val __obj = js.Dynamic.literal()
    if (MaxHumanLabeledObjectCount != null) __obj.updateDynamic("MaxHumanLabeledObjectCount")(MaxHumanLabeledObjectCount.asInstanceOf[js.Any])
    if (MaxPercentageOfInputDatasetLabeled != null) __obj.updateDynamic("MaxPercentageOfInputDatasetLabeled")(MaxPercentageOfInputDatasetLabeled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobStoppingConditions]
  }
}

