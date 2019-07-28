package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetSummary extends js.Object {
  /**
    * A list of "DataActionSummary" objects.
    */
  var actions: js.UndefOr[DatasetActionSummaries] = js.undefined
  /**
    * The time the data set was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the data set.
    */
  var datasetName: js.UndefOr[DatasetName] = js.undefined
  /**
    * The last time the data set was updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The status of the data set.
    */
  var status: js.UndefOr[DatasetStatus] = js.undefined
  /**
    * A list of triggers. A trigger causes data set content to be populated at a specified time interval or when another data set is populated. The list of triggers can be empty or contain up to five DataSetTrigger objects
    */
  var triggers: js.UndefOr[DatasetTriggers] = js.undefined
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
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (datasetName != null) __obj.updateDynamic("datasetName")(datasetName)
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (triggers != null) __obj.updateDynamic("triggers")(triggers)
    __obj.asInstanceOf[DatasetSummary]
  }
}

