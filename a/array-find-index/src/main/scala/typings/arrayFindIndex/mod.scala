package typings.arrayFindIndex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("array-find-index", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[T](
    arr: js.Array[T],
    predicate: js.Function3[/* element */ T, /* index */ Double, /* array */ js.Array[T], Boolean]
  ): Double = js.native
  def apply[T, U](
    arr: js.Array[T],
    predicate: js.ThisFunction3[/* this */ U, /* element */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
    ctx: U
  ): Double = js.native
}

