package typings.antvGBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilMatrixMod {
  
  @JSImport("@antv/g-base/lib/util/matrix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def invert(a: js.Array[Double]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def multiplyMatrix(a: js.Array[Double], b: js.Array[Double]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyMatrix")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def multiplyVec2(m: js.Array[Double], v: js.Array[Double]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyVec2")(m.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
}
