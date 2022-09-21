package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isPointInPolygonMod {
  
  @JSImport("@antv/util/lib/math/is-point-in-polygon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPointInPolygon(points: js.Array[js.Array[Double]], x: Double, y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointInPolygon")(points.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
