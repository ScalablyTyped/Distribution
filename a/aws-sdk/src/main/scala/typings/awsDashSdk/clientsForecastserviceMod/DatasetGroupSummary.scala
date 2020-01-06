package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetGroupSummary extends js.Object {
  /**
    * When the dataset group was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The Amazon Resource Name (ARN) of the dataset group.
    */
  var DatasetGroupArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the dataset group.
    */
  var DatasetGroupName: js.UndefOr[Name] = js.native
  /**
    * When the dataset group was created or last updated from a call to the UpdateDatasetGroup operation. While the dataset group is being updated, LastModificationTime is the current time of the ListDatasetGroups call.
    */
  var LastModificationTime: js.UndefOr[Timestamp] = js.native
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
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (DatasetGroupArn != null) __obj.updateDynamic("DatasetGroupArn")(DatasetGroupArn.asInstanceOf[js.Any])
    if (DatasetGroupName != null) __obj.updateDynamic("DatasetGroupName")(DatasetGroupName.asInstanceOf[js.Any])
    if (LastModificationTime != null) __obj.updateDynamic("LastModificationTime")(LastModificationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetGroupSummary]
  }
}

