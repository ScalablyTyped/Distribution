package typings.antd.esTableInterfaceMod

import typings.antd.esPaginationPaginationMod.PaginationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableState[T] extends js.Object {
  var columns: js.Array[ColumnProps[T]]
  var components: TableComponents
  var filters: TableStateFilters
  var pagination: PaginationConfig
  var pivot: js.UndefOr[Double] = js.undefined
  var prevProps: TableProps[T]
  var sortColumn: ColumnProps[T] | Null
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
}

object TableState {
  @scala.inline
  def apply[T](
    columns: js.Array[ColumnProps[T]],
    components: TableComponents,
    filters: TableStateFilters,
    pagination: PaginationConfig,
    prevProps: TableProps[T],
    pivot: Int | Double = null,
    sortColumn: ColumnProps[T] = null,
    sortOrder: SortOrder = null
  ): TableState[T] = {
    val __obj = js.Dynamic.literal(columns = columns, components = components, filters = filters, pagination = pagination, prevProps = prevProps)
    if (pivot != null) __obj.updateDynamic("pivot")(pivot.asInstanceOf[js.Any])
    if (sortColumn != null) __obj.updateDynamic("sortColumn")(sortColumn)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    __obj.asInstanceOf[TableState[T]]
  }
}

