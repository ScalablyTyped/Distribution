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

