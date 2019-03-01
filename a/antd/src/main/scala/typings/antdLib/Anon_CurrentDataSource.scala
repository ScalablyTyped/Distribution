package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentDataSource[T] extends js.Object {
  var currentDataSource: js.Array[T]
}

object Anon_CurrentDataSource {
  @scala.inline
  def apply[T](currentDataSource: js.Array[T]): Anon_CurrentDataSource[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentDataSource")(currentDataSource)
    __obj.asInstanceOf[Anon_CurrentDataSource[T]]
  }
}

