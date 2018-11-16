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

