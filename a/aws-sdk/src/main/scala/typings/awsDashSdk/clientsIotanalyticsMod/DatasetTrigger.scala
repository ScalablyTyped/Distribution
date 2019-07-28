package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetTrigger extends js.Object {
  /**
    * The data set whose content creation triggers the creation of this data set's contents.
    */
  var dataset: js.UndefOr[TriggeringDataset] = js.undefined
  /**
    * The "Schedule" when the trigger is initiated.
    */
  var schedule: js.UndefOr[Schedule] = js.undefined
}

object DatasetTrigger {
  @scala.inline
  def apply(dataset: TriggeringDataset = null, schedule: Schedule = null): DatasetTrigger = {
    val __obj = js.Dynamic.literal()
    if (dataset != null) __obj.updateDynamic("dataset")(dataset)
    if (schedule != null) __obj.updateDynamic("schedule")(schedule)
    __obj.asInstanceOf[DatasetTrigger]
  }
}

