package typings.antd

import typings.antd.libTableInterfaceMod.ColumnProps
import typings.antd.libTableInterfaceMod.SortOrder
import typings.antd.libTableInterfaceMod.TableStateFilters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FiltersSortColumn[T] extends js.Object {
  var filters: TableStateFilters
  var sortColumn: js.UndefOr[ColumnProps[T] | Null] = js.undefined
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
}

object Anon_FiltersSortColumn {
  @scala.inline
  def apply[T](filters: TableStateFilters, sortColumn: ColumnProps[T] = null, sortOrder: SortOrder = null): Anon_FiltersSortColumn[T] = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    if (sortColumn != null) __obj.updateDynamic("sortColumn")(sortColumn.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FiltersSortColumn[T]]
  }
}

