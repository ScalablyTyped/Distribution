package typings
package antdLib.libTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SorterResult[T] extends js.Object {
  var column: ColumnProps[T]
  var columnKey: java.lang.String
  var field: java.lang.String
  var order: SortOrder
}

object SorterResult {
  @scala.inline
  def apply[T](column: ColumnProps[T], columnKey: java.lang.String, field: java.lang.String, order: SortOrder): SorterResult[T] = {
    val __obj = js.Dynamic.literal(column = column, columnKey = columnKey, field = field, order = order)
  
    __obj.asInstanceOf[SorterResult[T]]
  }
}

