package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableInput extends js.Object {
  /**
    * A description of the table.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  /**
    * The last time that the table was accessed.
    */
  var LastAccessTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The last time that column statistics were computed for this table.
    */
  var LastAnalyzedTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The table name. For Hive compatibility, this is folded to lowercase when it is stored.
    */
  var Name: NameString
  /**
    * The table owner.
    */
  var Owner: js.UndefOr[NameString] = js.undefined
  /**
    * These key-value pairs define properties associated with the table.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.undefined
  /**
    * A list of columns by which the table is partitioned. Only primitive types are supported as partition keys. When you create a table used by Amazon Athena, and you do not specify any partitionKeys, you must at least set the value of partitionKeys to an empty list. For example:  "PartitionKeys": [] 
    */
  var PartitionKeys: js.UndefOr[ColumnList] = js.undefined
  /**
    * The retention time for this table.
    */
  var Retention: js.UndefOr[NonNegativeInteger] = js.undefined
  /**
    * A storage descriptor containing information about the physical storage of this table.
    */
  var StorageDescriptor: js.UndefOr[typings.awsDashSdk.clientsGlueMod.StorageDescriptor] = js.undefined
  /**
    * The type of this table (EXTERNAL_TABLE, VIRTUAL_VIEW, etc.).
    */
  var TableType: js.UndefOr[TableTypeString] = js.undefined
  /**
    * If the table is a view, the expanded text of the view; otherwise null.
    */
  var ViewExpandedText: js.UndefOr[ViewTextString] = js.undefined
  /**
    * If the table is a view, the original text of the view; otherwise null.
    */
  var ViewOriginalText: js.UndefOr[ViewTextString] = js.undefined
}

object TableInput {
  @scala.inline
  def apply(
    Name: NameString,
    Description: DescriptionString = null,
    LastAccessTime: Timestamp = null,
    LastAnalyzedTime: Timestamp = null,
    Owner: NameString = null,
    Parameters: ParametersMap = null,
    PartitionKeys: ColumnList = null,
    Retention: js.UndefOr[NonNegativeInteger] = js.undefined,
    StorageDescriptor: StorageDescriptor = null,
    TableType: TableTypeString = null,
    ViewExpandedText: ViewTextString = null,
    ViewOriginalText: ViewTextString = null
  ): TableInput = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (LastAccessTime != null) __obj.updateDynamic("LastAccessTime")(LastAccessTime)
    if (LastAnalyzedTime != null) __obj.updateDynamic("LastAnalyzedTime")(LastAnalyzedTime)
    if (Owner != null) __obj.updateDynamic("Owner")(Owner)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (PartitionKeys != null) __obj.updateDynamic("PartitionKeys")(PartitionKeys)
    if (!js.isUndefined(Retention)) __obj.updateDynamic("Retention")(Retention)
    if (StorageDescriptor != null) __obj.updateDynamic("StorageDescriptor")(StorageDescriptor)
    if (TableType != null) __obj.updateDynamic("TableType")(TableType)
    if (ViewExpandedText != null) __obj.updateDynamic("ViewExpandedText")(ViewExpandedText)
    if (ViewOriginalText != null) __obj.updateDynamic("ViewOriginalText")(ViewOriginalText)
    __obj.asInstanceOf[TableInput]
  }
}

