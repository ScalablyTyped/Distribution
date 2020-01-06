package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSetSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var Arn: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.Arn] = js.native
  /**
    * The time that this dataset was created.
    */
  var CreatedTime: js.UndefOr[Timestamp] = js.native
  /**
    * The ID of the dataset.
    */
  var DataSetId: js.UndefOr[ResourceId] = js.native
  /**
    * Indicates whether you want to import the data into SPICE.
    */
  var ImportMode: js.UndefOr[DataSetImportMode] = js.native
  /**
    * The last time that this dataset was updated.
    */
  var LastUpdatedTime: js.UndefOr[Timestamp] = js.native
  /**
    * A display name for the dataset.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  /**
    * The row-level security configuration for the dataset.
    */
  var RowLevelPermissionDataSet: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.RowLevelPermissionDataSet] = js.native
}

object DataSetSummary {
  @scala.inline
  def apply(
    Arn: Arn = null,
    CreatedTime: Timestamp = null,
    DataSetId: ResourceId = null,
    ImportMode: DataSetImportMode = null,
    LastUpdatedTime: Timestamp = null,
    Name: ResourceName = null,
    RowLevelPermissionDataSet: RowLevelPermissionDataSet = null
  ): DataSetSummary = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (DataSetId != null) __obj.updateDynamic("DataSetId")(DataSetId.asInstanceOf[js.Any])
    if (ImportMode != null) __obj.updateDynamic("ImportMode")(ImportMode.asInstanceOf[js.Any])
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RowLevelPermissionDataSet != null) __obj.updateDynamic("RowLevelPermissionDataSet")(RowLevelPermissionDataSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSetSummary]
  }
}

