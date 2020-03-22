package typings.antvScale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@antv/scale/lib/util/bisector", JSImport.Namespace)
@js.native
object utilBisectorMod extends js.Object {
  def default[T](getter: GetterFunc[T]): js.Function4[
    /* a */ js.Array[T], 
    /* x */ Double, 
    /* _lo */ js.UndefOr[Double], 
    /* _hi */ js.UndefOr[Double], 
    Double
  ] = js.native
  type GetterFunc[T] = js.Function1[/* o */ T, Double]
}

