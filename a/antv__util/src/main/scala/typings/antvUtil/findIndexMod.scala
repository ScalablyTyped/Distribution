package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findIndexMod {
  
  @JSImport("@antv/util/lib/find-index", JSImport.Default)
  @js.native
  def default[T](arr: js.Array[T], predicate: js.Function2[/* item */ T, /* idx */ js.UndefOr[Double], Boolean]): Double = js.native
  @JSImport("@antv/util/lib/find-index", JSImport.Default)
  @js.native
  def default[T](
    arr: js.Array[T],
    predicate: js.Function2[/* item */ T, /* idx */ js.UndefOr[Double], Boolean],
    fromIndex: Double
  ): Double = js.native
}
