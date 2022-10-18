package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMathIsPolygonsIntersectMod {
  
  @JSImport("@antv/util/lib/math/is-polygons-intersect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPolygonsIntersect(points1: js.Array[js.Array[Double]], points2: js.Array[js.Array[Double]]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPolygonsIntersect")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
