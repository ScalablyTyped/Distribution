package typings.antvUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/util/lib/find-index", JSImport.Namespace)
@js.native
object findIndexMod extends js.Object {
  
  def default[T](arr: js.Array[T], predicate: js.Function2[/* item */ T, /* idx */ js.UndefOr[Double], Boolean]): Double = js.native
  def default[T](
    arr: js.Array[T],
    predicate: js.Function2[/* item */ T, /* idx */ js.UndefOr[Double], Boolean],
    fromIndex: Double
  ): Double = js.native
}
