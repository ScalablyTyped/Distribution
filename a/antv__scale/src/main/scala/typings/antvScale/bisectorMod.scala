package typings.antvScale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bisectorMod {
  
  @JSImport("@antv/scale/lib/util/bisector", JSImport.Default)
  @js.native
  def default[T](getter: GetterFunc[T]): js.Function4[
    /* a */ js.Array[T], 
    /* x */ Double, 
    /* _lo */ js.UndefOr[Double], 
    /* _hi */ js.UndefOr[Double], 
    Double
  ] = js.native
  
  type GetterFunc[T] = js.Function1[/* o */ T, Double]
}
