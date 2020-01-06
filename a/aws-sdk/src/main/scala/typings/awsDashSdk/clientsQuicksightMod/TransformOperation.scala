package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformOperation extends js.Object {
  /**
    * A transform operation that casts a column to a different type.
    */
  var CastColumnTypeOperation: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.CastColumnTypeOperation] = js.native
  /**
    * An operation that creates calculated columns. Columns created in one such operation form a lexical closure.
    */
  var CreateColumnsOperation: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.CreateColumnsOperation] = js.native
  /**
    * An operation that filters rows based on some condition.
    */
  var FilterOperation: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.FilterOperation] = js.native
  /**
    * An operation that projects columns. Operations that come after a projection can only refer to projected columns.
    */
  var ProjectOperation: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.ProjectOperation] = js.native
  /**
    * An operation that renames a column.
    */
  var RenameColumnOperation: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.RenameColumnOperation] = js.native
  /**
    * An operation that tags a column with additional information.
    */
  var TagColumnOperation: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.TagColumnOperation] = js.native
}

object TransformOperation {
  @scala.inline
  def apply(
    CastColumnTypeOperation: CastColumnTypeOperation = null,
    CreateColumnsOperation: CreateColumnsOperation = null,
    FilterOperation: FilterOperation = null,
    ProjectOperation: ProjectOperation = null,
    RenameColumnOperation: RenameColumnOperation = null,
    TagColumnOperation: TagColumnOperation = null
  ): TransformOperation = {
    val __obj = js.Dynamic.literal()
    if (CastColumnTypeOperation != null) __obj.updateDynamic("CastColumnTypeOperation")(CastColumnTypeOperation.asInstanceOf[js.Any])
    if (CreateColumnsOperation != null) __obj.updateDynamic("CreateColumnsOperation")(CreateColumnsOperation.asInstanceOf[js.Any])
    if (FilterOperation != null) __obj.updateDynamic("FilterOperation")(FilterOperation.asInstanceOf[js.Any])
    if (ProjectOperation != null) __obj.updateDynamic("ProjectOperation")(ProjectOperation.asInstanceOf[js.Any])
    if (RenameColumnOperation != null) __obj.updateDynamic("RenameColumnOperation")(RenameColumnOperation.asInstanceOf[js.Any])
    if (TagColumnOperation != null) __obj.updateDynamic("TagColumnOperation")(TagColumnOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformOperation]
  }
}

