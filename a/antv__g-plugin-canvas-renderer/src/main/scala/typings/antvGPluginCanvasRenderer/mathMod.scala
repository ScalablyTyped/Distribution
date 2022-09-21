package typings.antvGPluginCanvasRenderer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathMod {
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/utils/math", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def distance(x1: Double, y1: Double, x2: Double, y2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isSamePoint(point1: js.Tuple2[Double, Double], point2: js.Tuple2[Double, Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSamePoint")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
