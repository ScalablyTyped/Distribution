package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableMetadata extends js.Object {
  /**
    * A list of the columns in the table.
    */
  var Columns: js.UndefOr[ColumnList] = js.native
  /**
    * The time that the table was created.
    */
  var CreateTime: js.UndefOr[Timestamp] = js.native
  /**
    * The last time the table was accessed.
    */
  var LastAccessTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the table.
    */
  var Name: NameString = js.native
  /**
    * A set of custom key/value pairs for table properties.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.native
  /**
    * A list of the partition keys in the table.
    */
  var PartitionKeys: js.UndefOr[ColumnList] = js.native
  /**
    * The type of table. In Athena, only EXTERNAL_TABLE is supported.
    */
  var TableType: js.UndefOr[TableTypeString] = js.native
}

object TableMetadata {
  @scala.inline
  def apply(
    Name: NameString,
    Columns: ColumnList = null,
    CreateTime: Timestamp = null,
    LastAccessTime: Timestamp = null,
    Parameters: ParametersMap = null,
    PartitionKeys: ColumnList = null,
    TableType: TableTypeString = null
  ): TableMetadata = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (Columns != null) __obj.updateDynamic("Columns")(Columns.asInstanceOf[js.Any])
    if (CreateTime != null) __obj.updateDynamic("CreateTime")(CreateTime.asInstanceOf[js.Any])
    if (LastAccessTime != null) __obj.updateDynamic("LastAccessTime")(LastAccessTime.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (PartitionKeys != null) __obj.updateDynamic("PartitionKeys")(PartitionKeys.asInstanceOf[js.Any])
    if (TableType != null) __obj.updateDynamic("TableType")(TableType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableMetadata]
  }
}

