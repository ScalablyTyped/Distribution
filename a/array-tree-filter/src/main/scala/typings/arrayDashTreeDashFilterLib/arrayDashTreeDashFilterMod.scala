package typings
package arrayDashTreeDashFilterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("array-tree-filter", JSImport.Namespace)
@js.native
object arrayDashTreeDashFilterMod extends js.Object {
  def default[T](data: js.Array[T], filterFn: js.Function2[/* item */ T, /* level */ scala.Double, scala.Boolean]): js.Array[T] = js.native
  def default[T](
    data: js.Array[T],
    filterFn: js.Function2[/* item */ T, /* level */ scala.Double, scala.Boolean],
    options: arrayDashTreeDashFilterLib.Anon_ChildrenKeyName
  ): js.Array[T] = js.native
}

