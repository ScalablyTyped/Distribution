package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetGroupSummary extends js.Object {
  /**
    * When the datase group was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the dataset group.
    */
  var DatasetGroupArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of the dataset group.
    */
  var DatasetGroupName: js.UndefOr[Name] = js.undefined
  /**
    * When the dataset group was created or last updated from a call to the UpdateDatasetGroup operation. While the dataset group is being updated, LastModificationTime is the current query time.
    */
  var LastModificationTime: js.UndefOr[Timestamp] = js.undefined
}

object DatasetGroupSummary {
  @scala.inline
  def apply(
    CreationTime: Timestamp = null,
    DatasetGroupArn: Arn = null,
    DatasetGroupName: Name = null,
    LastModificationTime: Timestamp = null
  ): DatasetGroupSummary = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (DatasetGroupArn != null) __obj.updateDynamic("DatasetGroupArn")(DatasetGroupArn)
    if (DatasetGroupName != null) __obj.updateDynamic("DatasetGroupName")(DatasetGroupName)
    if (LastModificationTime != null) __obj.updateDynamic("LastModificationTime")(LastModificationTime)
    __obj.asInstanceOf[DatasetGroupSummary]
  }
}

