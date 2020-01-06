package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dataset extends js.Object {
  /**
    * The creation date and time (in Unix time) of the dataset.
    */
  var creationDateTime: js.UndefOr[_Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the dataset that you want metadata for.
    */
  var datasetArn: js.UndefOr[Arn] = js.native
  /**
    * The Amazon Resource Name (ARN) of the dataset group.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.native
  /**
    * One of the following values:   Interactions   Items   Users  
    */
  var datasetType: js.UndefOr[DatasetType] = js.native
  /**
    * A time stamp that shows when the dataset was updated.
    */
  var lastUpdatedDateTime: js.UndefOr[_Date] = js.native
  /**
    * The name of the dataset.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The ARN of the associated schema.
    */
  var schemaArn: js.UndefOr[Arn] = js.native
  /**
    * The status of the dataset. A dataset can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.native
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
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime.asInstanceOf[js.Any])
    if (datasetArn != null) __obj.updateDynamic("datasetArn")(datasetArn.asInstanceOf[js.Any])
    if (datasetGroupArn != null) __obj.updateDynamic("datasetGroupArn")(datasetGroupArn.asInstanceOf[js.Any])
    if (datasetType != null) __obj.updateDynamic("datasetType")(datasetType.asInstanceOf[js.Any])
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (schemaArn != null) __obj.updateDynamic("schemaArn")(schemaArn.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dataset]
  }
}

