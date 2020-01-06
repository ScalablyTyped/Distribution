package typings.awsDashSdk.clientsKendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDataSourceRequest extends js.Object {
  /**
    * The connector configuration information that is required to access the repository.
    */
  var Configuration: DataSourceConfiguration = js.native
  /**
    * A description for the data source.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsKendraMod.Description] = js.native
  /**
    * The identifier of the index that should be associated with this data source.
    */
  var IndexId: typings.awsDashSdk.clientsKendraMod.IndexId = js.native
  /**
    * A unique name for the data source. A data source name can't be changed without deleting and recreating the data source.
    */
  var Name: DataSourceName = js.native
  /**
    * The Amazon Resource Name (ARN) of a role with permission to access the data source. For more information, see IAM Roles for Amazon Kendra.
    */
  var RoleArn: typings.awsDashSdk.clientsKendraMod.RoleArn = js.native
  /**
    * Sets the frequency that Amazon Kendra will check the documents in your repository and update the index. If you don't set a schedule Amazon Kendra will not periodically update the index. You can call the StartDataSourceSyncJob operation to update the index.
    */
  var Schedule: js.UndefOr[ScanSchedule] = js.native
  /**
    * The type of repository that contains the data source.
    */
  var Type: DataSourceType = js.native
}

object CreateDataSourceRequest {
  @scala.inline
  def apply(
    Configuration: DataSourceConfiguration,
    IndexId: IndexId,
    Name: DataSourceName,
    RoleArn: RoleArn,
    Type: DataSourceType,
    Description: Description = null,
    Schedule: ScanSchedule = null
  ): CreateDataSourceRequest = {
    val __obj = js.Dynamic.literal(Configuration = Configuration.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSourceRequest]
  }
}

