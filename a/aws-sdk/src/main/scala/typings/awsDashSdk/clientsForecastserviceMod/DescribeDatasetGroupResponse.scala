package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDatasetGroupResponse extends js.Object {
  /**
    * When the dataset group was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * An array of Amazon Resource Names (ARNs) of the datasets contained in the dataset group.
    */
  var DatasetArns: js.UndefOr[ArnList] = js.undefined
  /**
    * The ARN of the dataset group.
    */
  var DatasetGroupArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of the dataset group.
    */
  var DatasetGroupName: js.UndefOr[Name] = js.undefined
  /**
    * The domain associated with the dataset group. The Domain and DatasetType that you choose determine the fields that must be present in the training data that you import to the dataset. For example, if you choose the RETAIL domain and TARGET_TIME_SERIES as the DatasetType, Amazon Forecast requires item_id, timestamp, and demand fields to be present in your data. For more information, see howitworks-datasets-groups.
    */
  var Domain: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.Domain] = js.undefined
  /**
    * When the dataset group was created or last updated from a call to the UpdateDatasetGroup operation. While the dataset group is being updated, LastModificationTime is the current query time.
    */
  var LastModificationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The status of the dataset group. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     UPDATE_PENDING, UPDATE_IN_PROGRESS, UPDATE_FAILED    The UPDATE states apply when the UpdateDatasetGroup operation is called.  The Status of the dataset group must be ACTIVE before creating a predictor using the dataset group. 
    */
  var Status: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.Status] = js.undefined
}

object DescribeDatasetGroupResponse {
  @scala.inline
  def apply(
    CreationTime: Timestamp = null,
    DatasetArns: ArnList = null,
    DatasetGroupArn: Arn = null,
    DatasetGroupName: Name = null,
    Domain: Domain = null,
    LastModificationTime: Timestamp = null,
    Status: Status = null
  ): DescribeDatasetGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (DatasetArns != null) __obj.updateDynamic("DatasetArns")(DatasetArns)
    if (DatasetGroupArn != null) __obj.updateDynamic("DatasetGroupArn")(DatasetGroupArn)
    if (DatasetGroupName != null) __obj.updateDynamic("DatasetGroupName")(DatasetGroupName)
    if (Domain != null) __obj.updateDynamic("Domain")(Domain.asInstanceOf[js.Any])
    if (LastModificationTime != null) __obj.updateDynamic("LastModificationTime")(LastModificationTime)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[DescribeDatasetGroupResponse]
  }
}

