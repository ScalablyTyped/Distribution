package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MappingEntry extends js.Object {
  /**
    * The source path.
    */
  var SourcePath: js.UndefOr[SchemaPathString] = js.native
  /**
    * The name of the source table.
    */
  var SourceTable: js.UndefOr[TableName] = js.native
  /**
    * The source type.
    */
  var SourceType: js.UndefOr[FieldType] = js.native
  /**
    * The target path.
    */
  var TargetPath: js.UndefOr[SchemaPathString] = js.native
  /**
    * The target table.
    */
  var TargetTable: js.UndefOr[TableName] = js.native
  /**
    * The target type.
    */
  var TargetType: js.UndefOr[FieldType] = js.native
}

object MappingEntry {
  @scala.inline
  def apply(
    SourcePath: SchemaPathString = null,
    SourceTable: TableName = null,
    SourceType: FieldType = null,
    TargetPath: SchemaPathString = null,
    TargetTable: TableName = null,
    TargetType: FieldType = null
  ): MappingEntry = {
    val __obj = js.Dynamic.literal()
    if (SourcePath != null) __obj.updateDynamic("SourcePath")(SourcePath.asInstanceOf[js.Any])
    if (SourceTable != null) __obj.updateDynamic("SourceTable")(SourceTable.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    if (TargetPath != null) __obj.updateDynamic("TargetPath")(TargetPath.asInstanceOf[js.Any])
    if (TargetTable != null) __obj.updateDynamic("TargetTable")(TargetTable.asInstanceOf[js.Any])
    if (TargetType != null) __obj.updateDynamic("TargetType")(TargetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappingEntry]
  }
}

