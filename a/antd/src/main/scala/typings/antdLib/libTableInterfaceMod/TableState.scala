package typings
package antdLib.libTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableState[T] extends js.Object {
  var filters: TableStateFilters
  var pagination: antdLib.libPaginationPaginationMod.PaginationConfig
  var pivot: js.UndefOr[scala.Double] = js.undefined
  var sortColumn: ColumnProps[T] | scala.Null
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
}

object TableState {
  @scala.inline
  def apply[T](
    filters: TableStateFilters,
    pagination: antdLib.libPaginationPaginationMod.PaginationConfig,
    pivot: scala.Int | scala.Double = null,
    sortColumn: ColumnProps[T] = null,
    sortOrder: SortOrder = null
  ): TableState[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filters")(filters)
    __obj.updateDynamic("pagination")(pagination)
    if (pivot != null) __obj.updateDynamic("pivot")(pivot.asInstanceOf[js.Any])
    if (sortColumn != null) __obj.updateDynamic("sortColumn")(sortColumn)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    __obj.asInstanceOf[TableState[T]]
  }
}

