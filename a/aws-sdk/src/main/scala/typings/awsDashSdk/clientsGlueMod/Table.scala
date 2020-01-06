package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table extends js.Object {
  /**
    * The time when the table definition was created in the Data Catalog.
    */
  var CreateTime: js.UndefOr[Timestamp] = js.native
  /**
    * The person or entity who created the table.
    */
  var CreatedBy: js.UndefOr[NameString] = js.native
  /**
    * The name of the database where the table metadata resides. For Hive compatibility, this must be all lowercase.
    */
  var DatabaseName: js.UndefOr[NameString] = js.native
  /**
    * A description of the table.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * Indicates whether the table has been registered with AWS Lake Formation.
    */
  var IsRegisteredWithLakeFormation: js.UndefOr[Boolean] = js.native
  /**
    * The last time that the table was accessed. This is usually taken from HDFS, and might not be reliable.
    */
  var LastAccessTime: js.UndefOr[Timestamp] = js.native
  /**
    * The last time that column statistics were computed for this table.
    */
  var LastAnalyzedTime: js.UndefOr[Timestamp] = js.native
  /**
    * The table name. For Hive compatibility, this must be entirely lowercase.
    */
  var Name: NameString = js.native
  /**
    * The owner of the table.
    */
  var Owner: js.UndefOr[NameString] = js.native
  /**
    * These key-value pairs define properties associated with the table.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.native
  /**
    * A list of columns by which the table is partitioned. Only primitive types are supported as partition keys. When you create a table used by Amazon Athena, and you do not specify any partitionKeys, you must at least set the value of partitionKeys to an empty list. For example:  "PartitionKeys": [] 
    */
  var PartitionKeys: js.UndefOr[ColumnList] = js.native
  /**
    * The retention time for this table.
    */
  var Retention: js.UndefOr[NonNegativeInteger] = js.native
  /**
    * A storage descriptor containing information about the physical storage of this table.
    */
  var StorageDescriptor: js.UndefOr[typings.awsDashSdk.clientsGlueMod.StorageDescriptor] = js.native
  /**
    * The type of this table (EXTERNAL_TABLE, VIRTUAL_VIEW, etc.).
    */
  var TableType: js.UndefOr[TableTypeString] = js.native
  /**
    * The last time that the table was updated.
    */
  var UpdateTime: js.UndefOr[Timestamp] = js.native
  /**
    * If the table is a view, the expanded text of the view; otherwise null.
    */
  var ViewExpandedText: js.UndefOr[ViewTextString] = js.native
  /**
    * If the table is a view, the original text of the view; otherwise null.
    */
  var ViewOriginalText: js.UndefOr[ViewTextString] = js.native
}

object Table {
  @scala.inline
  def apply(
    Name: NameString,
    CreateTime: Timestamp = null,
    CreatedBy: NameString = null,
    DatabaseName: NameString = null,
    Description: DescriptionString = null,
    IsRegisteredWithLakeFormation: js.UndefOr[scala.Boolean] = js.undefined,
    LastAccessTime: Timestamp = null,
    LastAnalyzedTime: Timestamp = null,
    Owner: NameString = null,
    Parameters: ParametersMap = null,
    PartitionKeys: ColumnList = null,
    Retention: Int | Double = null,
    StorageDescriptor: StorageDescriptor = null,
    TableType: TableTypeString = null,
    UpdateTime: Timestamp = null,
    ViewExpandedText: ViewTextString = null,
    ViewOriginalText: ViewTextString = null
  ): Table = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (CreateTime != null) __obj.updateDynamic("CreateTime")(CreateTime.asInstanceOf[js.Any])
    if (CreatedBy != null) __obj.updateDynamic("CreatedBy")(CreatedBy.asInstanceOf[js.Any])
    if (DatabaseName != null) __obj.updateDynamic("DatabaseName")(DatabaseName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(IsRegisteredWithLakeFormation)) __obj.updateDynamic("IsRegisteredWithLakeFormation")(IsRegisteredWithLakeFormation.asInstanceOf[js.Any])
    if (LastAccessTime != null) __obj.updateDynamic("LastAccessTime")(LastAccessTime.asInstanceOf[js.Any])
    if (LastAnalyzedTime != null) __obj.updateDynamic("LastAnalyzedTime")(LastAnalyzedTime.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (PartitionKeys != null) __obj.updateDynamic("PartitionKeys")(PartitionKeys.asInstanceOf[js.Any])
    if (Retention != null) __obj.updateDynamic("Retention")(Retention.asInstanceOf[js.Any])
    if (StorageDescriptor != null) __obj.updateDynamic("StorageDescriptor")(StorageDescriptor.asInstanceOf[js.Any])
    if (TableType != null) __obj.updateDynamic("TableType")(TableType.asInstanceOf[js.Any])
    if (UpdateTime != null) __obj.updateDynamic("UpdateTime")(UpdateTime.asInstanceOf[js.Any])
    if (ViewExpandedText != null) __obj.updateDynamic("ViewExpandedText")(ViewExpandedText.asInstanceOf[js.Any])
    if (ViewOriginalText != null) __obj.updateDynamic("ViewOriginalText")(ViewOriginalText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
}

