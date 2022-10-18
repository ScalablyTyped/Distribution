package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMatrixMod {
  
  @JSImport("@antv/util/lib/matrix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def angleTo(v1: js.Tuple2[Double, Double], v2: js.Tuple2[Double, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angleTo")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def angleTo(v1: js.Tuple2[Double, Double], v2: js.Tuple2[Double, Double], direct: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angleTo")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], direct.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def direction(v1: js.Array[Double], v2: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("direction")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def transform(m: js.Array[Double], actions: js.Array[js.Array[Any]]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(m.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def vertical(out: js.Array[Double], v: js.Array[Double], flag: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("vertical")(out.asInstanceOf[js.Any], v.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
