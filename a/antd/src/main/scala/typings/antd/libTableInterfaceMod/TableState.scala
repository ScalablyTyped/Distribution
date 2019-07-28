package typings.antd.libTableInterfaceMod

import typings.antd.libPaginationPaginationMod.PaginationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableState[T] extends js.Object {
  var filters: TableStateFilters
  var pagination: PaginationConfig
  var pivot: js.UndefOr[Double] = js.undefined
  var sortColumn: ColumnProps[T] | Null
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
}

object TableState {
  @scala.inline
  def apply[T](
    filters: TableStateFilters,
    pagination: PaginationConfig,
    pivot: Int | Double = null,
    sortColumn: ColumnProps[T] = null,
    sortOrder: SortOrder = null
  ): TableState[T] = {
    val __obj = js.Dynamic.literal(filters = filters, pagination = pagination)
    if (pivot != null) __obj.updateDynamic("pivot")(pivot.asInstanceOf[js.Any])
    if (sortColumn != null) __obj.updateDynamic("sortColumn")(sortColumn)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    __obj.asInstanceOf[TableState[T]]
  }
}

