package typings.antvG2plot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matrixMod {
  
  @JSImport("@antv/g2plot/lib/utils/matrix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transform(actions: js.Array[js.Array[Any]]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(actions.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def transform(actions: js.Array[js.Array[Any]], matrix: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(actions.asInstanceOf[js.Any], matrix.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
