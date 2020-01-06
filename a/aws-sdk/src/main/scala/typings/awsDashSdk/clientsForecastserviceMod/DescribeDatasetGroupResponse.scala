package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDatasetGroupResponse extends js.Object {
  /**
    * When the dataset group was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * An array of Amazon Resource Names (ARNs) of the datasets contained in the dataset group.
    */
  var DatasetArns: js.UndefOr[ArnList] = js.native
  /**
    * The ARN of the dataset group.
    */
  var DatasetGroupArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the dataset group.
    */
  var DatasetGroupName: js.UndefOr[Name] = js.native
  /**
    * The domain associated with the dataset group.
    */
  var Domain: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.Domain] = js.native
  /**
    * When the dataset group was created or last updated from a call to the UpdateDatasetGroup operation. While the dataset group is being updated, LastModificationTime is the current time of the DescribeDatasetGroup call.
    */
  var LastModificationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The status of the dataset group. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     UPDATE_PENDING, UPDATE_IN_PROGRESS, UPDATE_FAILED    The UPDATE states apply when you call the UpdateDatasetGroup operation.  The Status of the dataset group must be ACTIVE before you can use the dataset group to create a predictor. 
    */
  var Status: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.Status] = js.native
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
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (DatasetArns != null) __obj.updateDynamic("DatasetArns")(DatasetArns.asInstanceOf[js.Any])
    if (DatasetGroupArn != null) __obj.updateDynamic("DatasetGroupArn")(DatasetGroupArn.asInstanceOf[js.Any])
    if (DatasetGroupName != null) __obj.updateDynamic("DatasetGroupName")(DatasetGroupName.asInstanceOf[js.Any])
    if (Domain != null) __obj.updateDynamic("Domain")(Domain.asInstanceOf[js.Any])
    if (LastModificationTime != null) __obj.updateDynamic("LastModificationTime")(LastModificationTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatasetGroupResponse]
  }
}

