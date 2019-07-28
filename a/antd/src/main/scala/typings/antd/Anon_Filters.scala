package typings.antd

import typings.antd.esTableInterfaceMod.SortOrder
import typings.antd.esTableInterfaceMod.TableStateFilters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filters extends js.Object {
  var filters: TableStateFilters
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
}

object Anon_Filters {
  @scala.inline
  def apply(filters: TableStateFilters, sortOrder: SortOrder = null): Anon_Filters = {
    val __obj = js.Dynamic.literal(filters = filters)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    __obj.asInstanceOf[Anon_Filters]
  }
}

