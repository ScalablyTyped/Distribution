package typings.antvUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/util/lib/remove", JSImport.Namespace)
@js.native
object removeMod extends js.Object {
  
  def default[T](
    arr: js.Array[T],
    predicate: js.Function3[/* value */ T, /* idx */ Double, /* arr */ js.UndefOr[js.Array[T]], Boolean]
  ): js.Array[T] = js.native
}
