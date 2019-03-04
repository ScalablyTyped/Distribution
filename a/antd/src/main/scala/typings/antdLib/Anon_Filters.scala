package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filters extends js.Object {
  var filters: antdLib.libTableInterfaceMod.TableStateFilters
  var sortOrder: js.UndefOr[antdLib.libTableInterfaceMod.SortOrder] = js.undefined
}

object Anon_Filters {
  @scala.inline
  def apply(
    filters: antdLib.libTableInterfaceMod.TableStateFilters,
    sortOrder: antdLib.libTableInterfaceMod.SortOrder = null
  ): Anon_Filters = {
    val __obj = js.Dynamic.literal(filters = filters)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    __obj.asInstanceOf[Anon_Filters]
  }
}

