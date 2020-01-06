package typings.awsDashSdk.clientsKendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDataSourceRequest extends js.Object {
  var Configuration: js.UndefOr[DataSourceConfiguration] = js.native
  /**
    * The new description for the data source.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsKendraMod.Description] = js.native
  /**
    * The unique identifier of the data source to update.
    */
  var Id: DataSourceId = js.native
  /**
    * The identifier of the index that contains the data source to update.
    */
  var IndexId: typings.awsDashSdk.clientsKendraMod.IndexId = js.native
  /**
    * The name of the data source to update. The name of the data source can't be updated. To rename a data source you must delete the data source and re-create it.
    */
  var Name: js.UndefOr[DataSourceName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the new role to use when the data source is accessing resources on your behalf.
    */
  var RoleArn: js.UndefOr[typings.awsDashSdk.clientsKendraMod.RoleArn] = js.native
  /**
    * The new update schedule for the data source.
    */
  var Schedule: js.UndefOr[ScanSchedule] = js.native
}

object UpdateDataSourceRequest {
  @scala.inline
  def apply(
    Id: DataSourceId,
    IndexId: IndexId,
    Configuration: DataSourceConfiguration = null,
    Description: Description = null,
    Name: DataSourceName = null,
    RoleArn: RoleArn = null,
    Schedule: ScanSchedule = null
  ): UpdateDataSourceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    if (Configuration != null) __obj.updateDynamic("Configuration")(Configuration.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataSourceRequest]
  }
}

