package typings.awsDashSdk.clientsKendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDataSourceResponse extends js.Object {
  /**
    * Information that describes where the data source is located and how the data source is configured. The specific information in the description depends on the data source provider.
    */
  var Configuration: js.UndefOr[DataSourceConfiguration] = js.native
  /**
    * The Unix timestamp of when the data source was created.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The description of the data source.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsKendraMod.Description] = js.native
  /**
    * When the Status field value is FAILED, the ErrorMessage field contains a description of the error that caused the data source to fail.
    */
  var ErrorMessage: js.UndefOr[typings.awsDashSdk.clientsKendraMod.ErrorMessage] = js.native
  /**
    * The identifier of the data source.
    */
  var Id: js.UndefOr[DataSourceId] = js.native
  /**
    * The identifier of the index that contains the data source.
    */
  var IndexId: js.UndefOr[typings.awsDashSdk.clientsKendraMod.IndexId] = js.native
  /**
    * The name that you gave the data source when it was created.
    */
  var Name: js.UndefOr[DataSourceName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the role that enables the data source to access its resources.
    */
  var RoleArn: js.UndefOr[typings.awsDashSdk.clientsKendraMod.RoleArn] = js.native
  /**
    * The schedule that Amazon Kendra will update the data source.
    */
  var Schedule: js.UndefOr[ScanSchedule] = js.native
  /**
    * The current status of the data source. When the status is ACTIVE the data source is ready to use. When the status is FAILED, the ErrorMessage field contains the reason that the data source failed.
    */
  var Status: js.UndefOr[DataSourceStatus] = js.native
  /**
    * The type of the data source.
    */
  var Type: js.UndefOr[DataSourceType] = js.native
  /**
    * The Unix timestamp of when the data source was last updated.
    */
  var UpdatedAt: js.UndefOr[Timestamp] = js.native
}

object DescribeDataSourceResponse {
  @scala.inline
  def apply(
    Configuration: DataSourceConfiguration = null,
    CreatedAt: Timestamp = null,
    Description: Description = null,
    ErrorMessage: ErrorMessage = null,
    Id: DataSourceId = null,
    IndexId: IndexId = null,
    Name: DataSourceName = null,
    RoleArn: RoleArn = null,
    Schedule: ScanSchedule = null,
    Status: DataSourceStatus = null,
    Type: DataSourceType = null,
    UpdatedAt: Timestamp = null
  ): DescribeDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    if (Configuration != null) __obj.updateDynamic("Configuration")(Configuration.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (IndexId != null) __obj.updateDynamic("IndexId")(IndexId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (UpdatedAt != null) __obj.updateDynamic("UpdatedAt")(UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDataSourceResponse]
  }
}

