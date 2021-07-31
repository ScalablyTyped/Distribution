package typings.antvScale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bisectorMod {
  
  @JSImport("@antv/scale/lib/util/bisector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](getter: GetterFunc[T]): js.Function4[
    /* a */ js.Array[T], 
    /* x */ Double, 
    /* _lo */ js.UndefOr[Double], 
    /* _hi */ js.UndefOr[Double], 
    Double
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(getter.asInstanceOf[js.Any]).asInstanceOf[js.Function4[
    /* a */ js.Array[T], 
    /* x */ Double, 
    /* _lo */ js.UndefOr[Double], 
    /* _hi */ js.UndefOr[Double], 
    Double
  ]]
  
  type GetterFunc[T] = js.Function1[/* o */ T, Double]
}
