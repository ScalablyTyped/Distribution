package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDataSetRequest extends js.Object {
  /**
    * The AWS account ID.
    */
  var AwsAccountId: typings.awsDashSdk.clientsQuicksightMod.AwsAccountId = js.native
  /**
    * Groupings of columns that work together in certain QuickSight features. Currently, only geospatial hierarchy is supported.
    */
  var ColumnGroups: js.UndefOr[ColumnGroupList] = js.native
  /**
    * The ID for the dataset that you want to update. This ID is unique per AWS Region for each AWS account.
    */
  var DataSetId: ResourceId = js.native
  /**
    * Indicates whether you want to import the data into SPICE.
    */
  var ImportMode: DataSetImportMode = js.native
  /**
    * Configures the combination and transformation of the data from the physical tables.
    */
  var LogicalTableMap: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.LogicalTableMap] = js.native
  /**
    * The display name for the dataset.
    */
  var Name: ResourceName = js.native
  /**
    * Declares the physical tables that are available in the underlying data sources.
    */
  var PhysicalTableMap: typings.awsDashSdk.clientsQuicksightMod.PhysicalTableMap = js.native
  /**
    * The row-level security configuration for the data you want to create.
    */
  var RowLevelPermissionDataSet: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.RowLevelPermissionDataSet] = js.native
}

object UpdateDataSetRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    DataSetId: ResourceId,
    ImportMode: DataSetImportMode,
    Name: ResourceName,
    PhysicalTableMap: PhysicalTableMap,
    ColumnGroups: ColumnGroupList = null,
    LogicalTableMap: LogicalTableMap = null,
    RowLevelPermissionDataSet: RowLevelPermissionDataSet = null
  ): UpdateDataSetRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], ImportMode = ImportMode.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PhysicalTableMap = PhysicalTableMap.asInstanceOf[js.Any])
    if (ColumnGroups != null) __obj.updateDynamic("ColumnGroups")(ColumnGroups.asInstanceOf[js.Any])
    if (LogicalTableMap != null) __obj.updateDynamic("LogicalTableMap")(LogicalTableMap.asInstanceOf[js.Any])
    if (RowLevelPermissionDataSet != null) __obj.updateDynamic("RowLevelPermissionDataSet")(RowLevelPermissionDataSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataSetRequest]
  }
}

