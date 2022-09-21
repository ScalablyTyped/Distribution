package typings.antvG2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gaussMod {
  
  @JSImport("@antv/g2/lib/chart/layout/constraint/gauss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gauss(a: js.Array[js.Array[Double]]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("gauss")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def multiply(v: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
}
