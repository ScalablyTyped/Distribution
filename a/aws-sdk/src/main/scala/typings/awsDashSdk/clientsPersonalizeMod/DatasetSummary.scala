package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetSummary extends js.Object {
  /**
    * The date and time (in Unix time) that the dataset was created.
    */
  var creationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var datasetArn: js.UndefOr[Arn] = js.undefined
  /**
    * The dataset type. One of the following values:   Interactions   Items   Users   Event-Interactions  
    */
  var datasetType: js.UndefOr[DatasetType] = js.undefined
  /**
    * The date and time (in Unix time) that the dataset was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The name of the dataset.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The status of the dataset. A dataset can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.undefined
}

object DatasetSummary {
  @scala.inline
  def apply(
    creationDateTime: _Date = null,
    datasetArn: Arn = null,
    datasetType: DatasetType = null,
    lastUpdatedDateTime: _Date = null,
    name: Name = null,
    status: Status = null
  ): DatasetSummary = {
    val __obj = js.Dynamic.literal()
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime)
    if (datasetArn != null) __obj.updateDynamic("datasetArn")(datasetArn)
    if (datasetType != null) __obj.updateDynamic("datasetType")(datasetType)
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[DatasetSummary]
  }
}

