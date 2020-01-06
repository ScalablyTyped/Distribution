package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetSummary extends js.Object {
  /**
    * A list of "DataActionSummary" objects.
    */
  var actions: js.UndefOr[DatasetActionSummaries] = js.native
  /**
    * The time the data set was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the data set.
    */
  var datasetName: js.UndefOr[DatasetName] = js.native
  /**
    * The last time the data set was updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.native
  /**
    * The status of the data set.
    */
  var status: js.UndefOr[DatasetStatus] = js.native
  /**
    * A list of triggers. A trigger causes data set content to be populated at a specified time interval or when another data set is populated. The list of triggers can be empty or contain up to five DataSetTrigger objects
    */
  var triggers: js.UndefOr[DatasetTriggers] = js.native
}

object DatasetSummary {
  @scala.inline
  def apply(
    actions: DatasetActionSummaries = null,
    creationTime: Timestamp = null,
    datasetName: DatasetName = null,
    lastUpdateTime: Timestamp = null,
    status: DatasetStatus = null,
    triggers: DatasetTriggers = null
  ): DatasetSummary = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (datasetName != null) __obj.updateDynamic("datasetName")(datasetName.asInstanceOf[js.Any])
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (triggers != null) __obj.updateDynamic("triggers")(triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetSummary]
  }
}

