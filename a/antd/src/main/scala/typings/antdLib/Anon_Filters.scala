package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filters extends js.Object {
  var filters: antdLib.esTableInterfaceMod.TableStateFilters
  var sortOrder: js.UndefOr[antdLib.esTableInterfaceMod.SortOrder] = js.undefined
}

object Anon_Filters {
  @scala.inline
  def apply(
    filters: antdLib.esTableInterfaceMod.TableStateFilters,
    sortOrder: antdLib.esTableInterfaceMod.SortOrder = null
  ): Anon_Filters = {
    val __obj = js.Dynamic.literal(filters = filters)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    __obj.asInstanceOf[Anon_Filters]
  }
}

