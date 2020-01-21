package typings.arrayTreeFilter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("array-tree-filter", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def default[T](data: js.Array[T], filterFn: js.Function2[/* item */ T, /* level */ Double, Boolean]): js.Array[T] = js.native
  def default[T](
    data: js.Array[T],
    filterFn: js.Function2[/* item */ T, /* level */ Double, Boolean],
    options: AnonChildrenKeyName
  ): js.Array[T] = js.native
}

