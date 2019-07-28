package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappingEntry extends js.Object {
  /**
    * The source path.
    */
  var SourcePath: js.UndefOr[SchemaPathString] = js.undefined
  /**
    * The name of the source table.
    */
  var SourceTable: js.UndefOr[TableName] = js.undefined
  /**
    * The source type.
    */
  var SourceType: js.UndefOr[FieldType] = js.undefined
  /**
    * The target path.
    */
  var TargetPath: js.UndefOr[SchemaPathString] = js.undefined
  /**
    * The target table.
    */
  var TargetTable: js.UndefOr[TableName] = js.undefined
  /**
    * The target type.
    */
  var TargetType: js.UndefOr[FieldType] = js.undefined
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
    if (SourcePath != null) __obj.updateDynamic("SourcePath")(SourcePath)
    if (SourceTable != null) __obj.updateDynamic("SourceTable")(SourceTable)
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType)
    if (TargetPath != null) __obj.updateDynamic("TargetPath")(TargetPath)
    if (TargetTable != null) __obj.updateDynamic("TargetTable")(TargetTable)
    if (TargetType != null) __obj.updateDynamic("TargetType")(TargetType)
    __obj.asInstanceOf[MappingEntry]
  }
}

