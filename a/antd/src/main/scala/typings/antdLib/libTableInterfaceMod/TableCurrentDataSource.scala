package typings
package antdLib.libTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCurrentDataSource[T] extends js.Object {
  var currentDataSource: js.Array[T]
}

object TableCurrentDataSource {
  @scala.inline
  def apply[T](currentDataSource: js.Array[T]): TableCurrentDataSource[T] = {
    val __obj = js.Dynamic.literal(currentDataSource = currentDataSource)
  
    __obj.asInstanceOf[TableCurrentDataSource[T]]
  }
}

