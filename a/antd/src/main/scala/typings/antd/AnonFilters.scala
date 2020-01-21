package typings.antd

import typings.antd.tableInterfaceMod.ColumnProps
import typings.antd.tableInterfaceMod.SortOrder
import typings.antd.tableInterfaceMod.TableStateFilters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilters[T] extends js.Object {
  var filters: TableStateFilters
  var sortColumn: js.UndefOr[ColumnProps[T] | Null] = js.undefined
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
}

object AnonFilters {
  @scala.inline
  def apply[T](filters: TableStateFilters, sortColumn: ColumnProps[T] = null, sortOrder: SortOrder = null): AnonFilters[T] = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    if (sortColumn != null) __obj.updateDynamic("sortColumn")(sortColumn.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilters[T]]
  }
}

