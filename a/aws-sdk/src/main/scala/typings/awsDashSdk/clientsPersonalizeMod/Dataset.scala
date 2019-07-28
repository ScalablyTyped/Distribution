package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dataset extends js.Object {
  /**
    * The creation date and time (in Unix time) of the dataset.
    */
  var creationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the dataset that you want metadata for.
    */
  var datasetArn: js.UndefOr[Arn] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the dataset group.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.undefined
  /**
    * One of the following values:   Interactions   Items   Users  
    */
  var datasetType: js.UndefOr[DatasetType] = js.undefined
  /**
    * A time stamp that shows when the dataset was updated.
    */
  var lastUpdatedDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The name of the dataset.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The ARN of the associated schema.
    */
  var schemaArn: js.UndefOr[Arn] = js.undefined
  /**
    * The status of the dataset. A dataset can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.undefined
}

object Dataset {
  @scala.inline
  def apply(
    creationDateTime: _Date = null,
    datasetArn: Arn = null,
    datasetGroupArn: Arn = null,
    datasetType: DatasetType = null,
    lastUpdatedDateTime: _Date = null,
    name: Name = null,
    schemaArn: Arn = null,
    status: Status = null
  ): Dataset = {
    val __obj = js.Dynamic.literal()
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime)
    if (datasetArn != null) __obj.updateDynamic("datasetArn")(datasetArn)
    if (datasetGroupArn != null) __obj.updateDynamic("datasetGroupArn")(datasetGroupArn)
    if (datasetType != null) __obj.updateDynamic("datasetType")(datasetType)
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (schemaArn != null) __obj.updateDynamic("schemaArn")(schemaArn)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Dataset]
  }
}

