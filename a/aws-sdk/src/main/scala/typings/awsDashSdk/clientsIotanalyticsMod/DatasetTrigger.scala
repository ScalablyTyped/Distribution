package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetTrigger extends js.Object {
  /**
    * The data set whose content creation triggers the creation of this data set's contents.
    */
  var dataset: js.UndefOr[TriggeringDataset] = js.native
  /**
    * The "Schedule" when the trigger is initiated.
    */
  var schedule: js.UndefOr[Schedule] = js.native
}

object DatasetTrigger {
  @scala.inline
  def apply(dataset: TriggeringDataset = null, schedule: Schedule = null): DatasetTrigger = {
    val __obj = js.Dynamic.literal()
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetTrigger]
  }
}

