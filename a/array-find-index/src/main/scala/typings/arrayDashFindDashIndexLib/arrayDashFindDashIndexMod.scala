package typings
package arrayDashFindDashIndexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("array-find-index", JSImport.Namespace)
@js.native
object arrayDashFindDashIndexMod extends js.Object {
  def apply[T](
    arr: js.Array[T],
    predicate: js.Function3[/* element */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Boolean]
  ): scala.Double = js.native
  def apply[T, U](
    arr: js.Array[T],
    predicate: js.ThisFunction3[
      /* this */ U, 
      /* element */ T, 
      /* index */ scala.Double, 
      /* array */ js.Array[T], 
      scala.Boolean
    ],
    ctx: U
  ): scala.Double = js.native
}

