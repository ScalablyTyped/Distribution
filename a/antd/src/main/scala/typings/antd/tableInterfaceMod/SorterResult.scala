package typings.antd.tableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SorterResult[RecordType] extends js.Object {
  var column: js.UndefOr[ColumnType[RecordType]] = js.undefined
  var columnKey: js.UndefOr[Key] = js.undefined
  var field: js.UndefOr[Key | js.Array[Key]] = js.undefined
  var order: js.UndefOr[SortOrder] = js.undefined
}

object SorterResult {
  @scala.inline
  def apply[RecordType](
    column: ColumnType[RecordType] = null,
    columnKey: Key = null,
    field: Key | js.Array[Key] = null,
    order: SortOrder = null
  ): SorterResult[RecordType] = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[SorterResult[RecordType]]
  }
}

