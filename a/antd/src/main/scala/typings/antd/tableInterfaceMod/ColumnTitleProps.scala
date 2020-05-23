package typings.antd.tableInterfaceMod

import typings.antd.anon.Column
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnTitleProps[RecordType] extends js.Object {
  var filters: js.UndefOr[Record[String, js.Array[String]]] = js.undefined
  /** @deprecated Please use `sorterColumns` instead. */
  var sortColumn: js.UndefOr[ColumnType[RecordType]] = js.undefined
  var sortColumns: js.UndefOr[js.Array[Column[RecordType]]] = js.undefined
  /** @deprecated Please use `sorterColumns` instead. */
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
}

object ColumnTitleProps {
  @scala.inline
  def apply[RecordType](
    filters: Record[String, js.Array[String]] = null,
    sortColumn: ColumnType[RecordType] = null,
    sortColumns: js.Array[Column[RecordType]] = null,
    sortOrder: js.UndefOr[Null | SortOrder] = js.undefined
  ): ColumnTitleProps[RecordType] = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (sortColumn != null) __obj.updateDynamic("sortColumn")(sortColumn.asInstanceOf[js.Any])
    if (sortColumns != null) __obj.updateDynamic("sortColumns")(sortColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(sortOrder)) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnTitleProps[RecordType]]
  }
}

