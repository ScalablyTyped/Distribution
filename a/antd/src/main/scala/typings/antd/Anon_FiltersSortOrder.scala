package typings.antd

import typings.antd.libTableInterfaceMod.SortOrder
import typings.antd.libTableInterfaceMod.TableStateFilters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FiltersSortOrder extends js.Object {
  var filters: TableStateFilters
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
}

object Anon_FiltersSortOrder {
  @scala.inline
  def apply(filters: TableStateFilters, sortOrder: SortOrder = null): Anon_FiltersSortOrder = {
    val __obj = js.Dynamic.literal(filters = filters)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    __obj.asInstanceOf[Anon_FiltersSortOrder]
  }
}

